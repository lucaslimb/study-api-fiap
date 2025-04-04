package com.github.lucaslimb.study_apir.dto;

import com.github.lucaslimb.study_apir.model.Product;

import java.math.BigDecimal;

public class ProductRequestUpdate {

    private BigDecimal valor;

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Product toModel(Product product){
        product.setValor(this.valor);
        return product;
    }
}
