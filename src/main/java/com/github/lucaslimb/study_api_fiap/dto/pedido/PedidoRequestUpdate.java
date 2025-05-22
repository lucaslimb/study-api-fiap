package com.github.lucaslimb.study_api_fiap.dto.pedido;

import com.github.lucaslimb.study_api_fiap.model.Pedido;
import com.github.lucaslimb.study_api_fiap.model.PedidoStatus;

public class PedidoRequestUpdate {

    private PedidoStatus status;

    public Pedido toModel(Pedido pedido){
        pedido.setStatus(this.status);
        return pedido;
    }

    public PedidoStatus getStatus() {
        return status;
    }

    public void setStatus(PedidoStatus status) {
        this.status = status;
    }

}
