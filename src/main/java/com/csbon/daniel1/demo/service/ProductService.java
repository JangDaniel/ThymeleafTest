package com.csbon.daniel1.demo.service;

import com.csbon.daniel1.demo.model.Product;
import com.csbon.daniel1.demo.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(final Integer id) {
        return productRepository.findById(id);
    }
}
