package com.github.lucaslimb.study_api_fiap.dto.pedido;

import com.github.lucaslimb.study_api_fiap.dto.itens.ItensResponse;
import com.github.lucaslimb.study_api_fiap.model.Itens;
import com.github.lucaslimb.study_api_fiap.model.Pedido;

import java.util.List;
import java.util.stream.Collectors;

public class PedidoResponse {

    private Long id;
    private String status;
    private List<ItensResponse> itens;

    public PedidoResponse toDto(Pedido pedido){
        this.setId(pedido.getId());
        this.setStatus(pedido.getStatus());

        List<ItensResponse> itens = pedido.getItens().stream()
                .map(i -> {
                    ItensResponse item = new ItensResponse();
                    return item;
                }).collect(Collectors.toList());
        this.setItens(itens);
        return this;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ItensResponse> getItens() {
        return itens;
    }

    public void setItens(List<ItensResponse> itens) {
        this.itens = itens;
    }
}
