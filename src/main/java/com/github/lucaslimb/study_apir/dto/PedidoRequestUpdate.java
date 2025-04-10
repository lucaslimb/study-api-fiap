package com.github.lucaslimb.study_apir.dto;

import com.github.lucaslimb.study_apir.model.Pedido;

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
