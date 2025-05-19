package com.github.lucaslimb.study_api_fiap.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private PedidoStatus status;

    private LocalDate dataPedido;

    private LocalDate dataEntrega;

    @OneToMany(mappedBy = "pedido",
                cascade = CascadeType.ALL,
                orphanRemoval = true)
    private List<Itens> itens;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PedidoStatus getStatus() {
        return status;
    }
    public void setStatus(PedidoStatus status) {
        this.status = status;
    }
    public LocalDate getDataPedido() {
        return dataPedido;
    }
    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }
    public LocalDate getDataEntrega() {
        return dataEntrega;
    }
    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public List<Itens> getItens() {
        return itens;
    }

    public void setItens(List<Itens> itens) {
        this.itens = itens;
    }
}
