package com.github.lucaslimb.study_apir.controller;

import java.util.List;
import java.util.stream.Collectors;
import com.github.lucaslimb.study_apir.dto.ProdutoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.github.lucaslimb.study_apir.dto.ProdutoRequestCreate;
import com.github.lucaslimb.study_apir.dto.ProdutoRequestUpdate;
import com.github.lucaslimb.study_apir.service.ProdutoService;

@RestController
@RequestMapping("produtos")
public class ControllerProduto {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<ProdutoResponse> create(@RequestBody ProdutoRequestCreate dto) {
        return ResponseEntity.status(201).body(
                new ProdutoResponse().toDto(
                        produtoService.createProduto(dto)
                )
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        boolean result = produtoService.deleteProduto(id);

        if(result){
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }   
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProdutoResponse> update(@PathVariable Long id, @RequestBody ProdutoRequestUpdate dto) {
        return produtoService.updateProduto(id, dto)
            .map(p -> new ProdutoResponse().toDto(p))
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoResponse> findById(@PathVariable Long id) {
        return produtoService.getProdutoById(id)
                .map(p -> new ProdutoResponse().toDto(p))
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<ProdutoResponse>> findAll() {
        List<ProdutoResponse> response =
                produtoService.getAll().stream()
                .map(p -> new ProdutoResponse().toDto(p))
                .collect(Collectors.toList());
        return ResponseEntity.ok(response);
    }
}
