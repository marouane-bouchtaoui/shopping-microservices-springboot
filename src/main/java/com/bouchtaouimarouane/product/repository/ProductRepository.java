package com.bouchtaouimarouane.product.repository;

import com.bouchtaouimarouane.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
