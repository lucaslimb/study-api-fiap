package com.github.lucaslimb.study_api_fiap.dto.pedido;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.lucaslimb.study_api_fiap.dto.itens.ItensRequestCreate;
import com.github.lucaslimb.study_api_fiap.model.Pedido;

import java.time.LocalDate;
import java.util.List;

public class PedidoRequestCreate {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dataPedido;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dataEntrega;

    private List<ItensRequestCreate> itens;

    public List<ItensRequestCreate> getItens() {
        return itens;
    }

    public void setItens(List<ItensRequestCreate> itens) {
        this.itens = itens;
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

}
