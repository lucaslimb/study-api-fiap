package com.github.lucaslimb.study_apir.repository;

import com.github.lucaslimb.study_apir.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
