package com.github.lucaslimb.study_apir.dto;

import com.github.lucaslimb.study_apir.model.Product;

import java.math.BigDecimal;

public class ProductRequestCreate {

    private String nome;

    public Product toModel(){
        BigDecimal VALOR_PADRAO = new BigDecimal(500);
        Product product = new Product();
        product.setNome(this.nome);
        product.setValor(VALOR_PADRAO);
        return product;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
