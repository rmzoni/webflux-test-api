package com.wiredbraincoffee.productapiannotation.repository;

import com.wiredbraincoffee.productapiannotation.model.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository
        extends ReactiveMongoRepository<Product, String> {
}
