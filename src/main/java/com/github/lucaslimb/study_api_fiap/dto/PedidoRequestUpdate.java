package com.github.lucaslimb.study_api_fiap.dto;

import com.github.lucaslimb.study_api_fiap.model.Pedido;

public class PedidoRequestUpdate {

    private String status;

    public Pedido toModel(Pedido pedido){
        pedido.setStatus(this.status);
        return pedido;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
