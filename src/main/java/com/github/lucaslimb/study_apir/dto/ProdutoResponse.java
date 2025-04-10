package com.github.lucaslimb.study_apir.dto;

import com.github.lucaslimb.study_apir.model.Produto;

import java.math.BigDecimal;

public class ProdutoResponse {

    private Long id;
    private String nome;
    private BigDecimal valor;

    public ProdutoResponse toDto(Produto produto){
        this.setId(produto.getId());
        this.setNome(produto.getNome());
        this.setValor(produto.getValor());
        return this;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
