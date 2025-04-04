package com.github.lucaslimb.study_apir.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.github.lucaslimb.study_apir.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.github.lucaslimb.study_apir.dto.ProductRequestCreate;
import com.github.lucaslimb.study_apir.dto.ProductRequestUpdate;
import com.github.lucaslimb.study_apir.model.Product;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    private static final BigDecimal VALOR_PADRAO = new BigDecimal(500);

    public Product createProduct(ProductRequestCreate dto){
        Product product = new Product();
        product.setNome(dto.getNome());
        product.setValor(VALOR_PADRAO);
        return repository.save(product);
    }

    public Optional<Product> getProductById(Long id){
        return repository.findById(id);
    }

    public List<Product> getAll(){
        return repository.findAll();
    }

    public Optional<Product> updateProduct(Long id, ProductRequestUpdate dto){
        Product product = new Product();
        product.setId(id);
        product.setValor(dto.getValor());
        return null; //repository.save(product);
    }

    public boolean deleteProduct(Long id){
        Optional<Product> optional = repository.findById(id);
        if(optional.isPresent()) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

}
