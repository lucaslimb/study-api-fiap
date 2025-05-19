package com.github.lucaslimb.study_api_fiap.repository;

import java.util.List;
import com.github.lucaslimb.study_api_fiap.model.Pedido;
import com.github.lucaslimb.study_api_fiap.model.PedidoStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    // select p.* from pedido p where p.status = '?'
    public List<Pedido> findByStatus(PedidoStatus status);
}
