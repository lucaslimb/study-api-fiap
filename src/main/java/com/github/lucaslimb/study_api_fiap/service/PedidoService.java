package com.github.lucaslimb.study_api_fiap.service;

import com.github.lucaslimb.study_api_fiap.dto.PedidoRequestCreate;
import com.github.lucaslimb.study_api_fiap.dto.PedidoRequestUpdate;
import com.github.lucaslimb.study_api_fiap.model.Pedido;
import com.github.lucaslimb.study_api_fiap.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public Pedido createPedido(PedidoRequestCreate dto){
        return repository.save(dto.toModel());
    }

    public Optional<Pedido> getPedidoById(Long id){
        return repository.findById(id);
    }

    public List<Pedido> getAll(){
        return repository.findAll();
    }

    public Optional<Pedido> updatePedido(Long id, PedidoRequestUpdate dto){
        return repository.findById(id)
                .map(p -> repository.save(dto.toModel(p)));
    }

    public boolean deletePedido(Long id){
        if(repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

}
