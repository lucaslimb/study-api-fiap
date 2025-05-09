package com.github.lucaslimb.study_api_fiap.service;

import com.github.lucaslimb.study_api_fiap.dto.pedido.PedidoRequestCreate;
import com.github.lucaslimb.study_api_fiap.dto.pedido.PedidoRequestUpdate;
import com.github.lucaslimb.study_api_fiap.model.Itens;
import com.github.lucaslimb.study_api_fiap.model.Pedido;
import com.github.lucaslimb.study_api_fiap.model.Produto;
import com.github.lucaslimb.study_api_fiap.repository.PedidoRepository;
import com.github.lucaslimb.study_api_fiap.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ProdutoRepository produtoRepository;


    public Pedido createPedido(PedidoRequestCreate dto){
        Pedido pedido = new Pedido();
        pedido.setStatus("ABERTO");
        List<Itens> itens = dto.getItens().stream()
                .map(i -> {
                    Itens item = new Itens();
                    Produto produto = produtoRepository
                            .findById(i.getProduto_id())
                            .orElseThrow(() ->
                                    new RuntimeException(
                                            "Produto inexistente: " + i.getProduto_id()));
                    item.setProduto(produto);
                    item.setQuantidade(i.getQuantidade());
                    item.setValor((produto.getValor()).multiply(i.getQuantidade()));
                    item.setPedido(pedido);
                    return item;
                }).collect(Collectors.toList());
        pedido.setItens(itens);
        return pedidoRepository.save(pedido);
    }

    public Optional<Pedido> getPedidoById(Long id){
        return pedidoRepository.findById(id);
    }

    public List<Pedido> getAll(){
        return pedidoRepository.findAll();
    }

    public Optional<Pedido> updatePedido(Long id, PedidoRequestUpdate dto){
        return pedidoRepository.findById(id)
                .map(p -> pedidoRepository.save(dto.toModel(p)));
    }

    public boolean deletePedido(Long id){
        if(pedidoRepository.existsById(id)) {
            pedidoRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
