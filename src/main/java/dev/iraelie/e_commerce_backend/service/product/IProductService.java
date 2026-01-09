package dev.iraelie.e_commerce_backend.service.product;

import dev.iraelie.e_commerce_backend.model.Product;
import dev.iraelie.e_commerce_backend.request.AddProductRequest;
import dev.iraelie.e_commerce_backend.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest product);
    void deleteProductById(Long id);
    Product updateProduct(ProductUpdateRequest product, Long id);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryName(String category);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByBrandAndName(String category, String name);
    Long countProductsByBrandAndName(String brand, String name);
}
