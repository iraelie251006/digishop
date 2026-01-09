package dev.iraelie.e_commerce_backend.repository;

import dev.iraelie.e_commerce_backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public class ProductRepository implements JpaRepository<Product, Long> {
}
