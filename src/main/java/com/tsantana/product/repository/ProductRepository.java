package com.tsantana.product.repository;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import com.tsantana.product.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ReactiveCosmosRepository<Product, String> {
}
