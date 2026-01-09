package dev.iraelie.e_commerce_backend.request;

import dev.iraelie.e_commerce_backend.model.Category;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class AddProductRequest {
    private Long id;
    private String name;
    private BigDecimal price;
    private String description;
    private int inventory;
    private String brand;
    private Category category;
}
