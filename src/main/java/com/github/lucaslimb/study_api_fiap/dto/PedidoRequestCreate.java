package com.github.lucaslimb.study_api_fiap.dto;

import com.github.lucaslimb.study_api_fiap.model.Pedido;

public class PedidoRequestCreate {

    private String status;

    public Pedido toModel(){
        Pedido pedido = new Pedido();
        pedido.setStatus(this.status);
        return pedido;
    }

}
