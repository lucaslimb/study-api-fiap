package com.github.lucaslimb.study_api_fiap.dto;

import com.github.lucaslimb.study_api_fiap.model.Produto;

import java.math.BigDecimal;

public class ProdutoRequestCreate {

    private String nome;

    public Produto toModel(){
        BigDecimal VALOR_PADRAO = new BigDecimal(500);
        Produto produto = new Produto();
        produto.setNome(this.nome);
        produto.setValor(VALOR_PADRAO);
        return produto;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
