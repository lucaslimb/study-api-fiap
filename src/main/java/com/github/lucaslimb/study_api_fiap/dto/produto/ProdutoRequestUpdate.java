package com.github.lucaslimb.study_api_fiap.dto.produto;

import com.github.lucaslimb.study_api_fiap.model.Produto;

import java.math.BigDecimal;

public class ProdutoRequestUpdate {

    private BigDecimal valor;

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Produto toModel(Produto produto){
        produto.setValor(this.valor);
        return produto;
    }
}
