package com.github.lucaslimb.study_api_fiap.model;

public enum PedidoStatus {
    ABERTO("Pedido Aberto"),
    CANCELADO("Pedido Cancelado"),
    ENTREGUE("Pedido Entregue");

    private String mensagem;

    PedidoStatus(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
