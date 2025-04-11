package com.github.lucaslimb.study_api_fiap.repository;

import com.github.lucaslimb.study_api_fiap.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
