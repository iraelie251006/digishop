package dev.iraelie.e_commerce_backend.repository;

import dev.iraelie.e_commerce_backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByName(String name);

    List<Product> findByBrand(String brand);

    List<Product> findByCategory(String category);

    List<Product> findByCategoryAndBrand(String category, String brand);

    List<Product> findByBrandAndName(String category, String name);

    Long countByBrandAndName(String brand, String name);
}
