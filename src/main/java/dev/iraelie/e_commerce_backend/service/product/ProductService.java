package dev.iraelie.e_commerce_backend.service.product;

import dev.iraelie.e_commerce_backend.model.Product;

import java.util.List;

public class ProductService implements IProductService{
    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public void deleteProductById(Long id) {

    }

    @Override
    public Product updateProduct(Product product, Long id) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product getProductById(Long id) {
        return null;
    }

    @Override
    public List<Product> getProductsByName(String name) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByBrand(String brand) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByCategoryName(String category) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByCategoryAndBrand(String category, String brand) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByBrandAndName(String category, String name) {
        return List.of();
    }

    @Override
    public Long countProductsByBrandAndName(String brand, String name) {
        return 0L;
    }
}
