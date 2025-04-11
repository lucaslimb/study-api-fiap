package com.github.lucaslimb.study_apir_fiap.dto;

import com.github.lucaslimb.study_apir_fiap.model.Pedido;

public class PedidoRequestCreate {

    private String status;

    public Pedido toModel(){
        Pedido pedido = new Pedido();
        pedido.setStatus(this.status);
        return pedido;
    }

}
