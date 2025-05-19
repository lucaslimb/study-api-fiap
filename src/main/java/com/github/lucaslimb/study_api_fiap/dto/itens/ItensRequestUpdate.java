package com.github.lucaslimb.study_api_fiap.dto.itens;

import com.github.lucaslimb.study_api_fiap.model.Itens;
import com.github.lucaslimb.study_api_fiap.model.Pedido;
import com.github.lucaslimb.study_api_fiap.model.Produto;

import java.math.BigDecimal;

public class ItensRequestUpdate {
    private BigDecimal valor;

    public Itens toModel(Pedido pedido, Produto produto){

        Itens item = new Itens();
        item.setValor(this.valor);
        item.setProduto(produto);
        item.setPedido(pedido);
        return item;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
