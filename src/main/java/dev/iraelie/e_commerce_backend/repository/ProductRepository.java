package dev.iraelie.e_commerce_backend.repository;

import dev.iraelie.e_commerce_backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class ProductRepository implements JpaRepository<Product, Long> {
    public List<Product> findByName(String name) {}

    public List<Product> findByBrand(String brand) {}

    public List<Product> findByCategory(String category) {}

    public List<Product> findByCategoryAndBrand(String category, String brand) {}

    public List<Product> findByBrandAndName(String category, String name) {}

    public Long countByBrandAndName(String brand, String name) {}
}
