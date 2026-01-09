package dev.iraelie.e_commerce_backend.repository;

import dev.iraelie.e_commerce_backend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);
}
