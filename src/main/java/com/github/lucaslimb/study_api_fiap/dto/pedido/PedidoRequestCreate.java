package com.github.lucaslimb.study_api_fiap.dto.pedido;

import com.github.lucaslimb.study_api_fiap.dto.itens.ItensRequestCreate;
import com.github.lucaslimb.study_api_fiap.model.Pedido;
import java.util.List;

public class PedidoRequestCreate {

    private List<ItensRequestCreate> itens;

    public List<ItensRequestCreate> getItens() {
        return itens;
    }

    public void setItens(List<ItensRequestCreate> itens) {
        this.itens = itens;
    }

}
