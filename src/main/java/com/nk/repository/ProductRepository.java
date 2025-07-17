package com.nk.repository;

import com.nk.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Spring Data JPA provides basic CRUD operations by default
    // Additional custom query methods can be added here if needed
}