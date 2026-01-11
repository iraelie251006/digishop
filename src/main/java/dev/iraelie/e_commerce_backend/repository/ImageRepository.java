package dev.iraelie.e_commerce_backend.repository;

import dev.iraelie.e_commerce_backend.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
