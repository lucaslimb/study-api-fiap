package com.github.lucaslimb.study_apir.dto;

import com.github.lucaslimb.study_apir.model.Pedido;

public class PedidoRequestCreate {

    private String status;

    public Pedido toModel(){
        Pedido pedido = new Pedido();
        pedido.setStatus(this.status);
        return pedido;
    }

}
