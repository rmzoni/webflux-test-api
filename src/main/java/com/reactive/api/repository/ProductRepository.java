package com.reactive.api.repository;

import com.reactive.api.model.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository
        extends ReactiveMongoRepository<Product, String> {
}
