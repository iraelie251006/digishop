package dev.iraelie.e_commerce_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Category {
    private Long id;
    private String name;

    @OneToMany
    @JoinColumn(name = "productId")
    private List<Product> products;
}
