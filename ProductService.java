package com.example.repository;

import com.example.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    // No need to write CRUD methods, Spring Data MongoDB handles it automatically
}
