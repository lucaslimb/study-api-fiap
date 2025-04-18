package com.github.lucaslimb.study_api_fiap.service;

import com.github.lucaslimb.study_api_fiap.dto.produto.ProdutoRequestCreate;
import com.github.lucaslimb.study_api_fiap.dto.produto.ProdutoRequestUpdate;
import com.github.lucaslimb.study_api_fiap.model.Produto;
import com.github.lucaslimb.study_api_fiap.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Produto createProduto(ProdutoRequestCreate dto){
        return repository.save(dto.toModel());
    }

    public Optional<Produto> getProdutoById(Long id){
        return repository.findById(id);
    }

    public List<Produto> getAll(){
        return repository.findAll();
    }

    public Optional<Produto> updateProduto(Long id, ProdutoRequestUpdate dto){
        return repository.findById(id)
                .map(p -> repository.save(dto.toModel(p)));
    }

    public boolean deleteProduto(Long id){
        if(repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

}
