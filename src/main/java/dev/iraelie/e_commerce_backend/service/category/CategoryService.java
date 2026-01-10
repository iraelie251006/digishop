package dev.iraelie.e_commerce_backend.service.category;

import dev.iraelie.e_commerce_backend.model.Category;

import java.util.List;

public class CategoryService implements ICategoryService{
    @Override
    public Category getCategoryById(Long id) {
        return null;
    }

    @Override
    public Category getCategoryByName(String name) {
        return null;
    }

    @Override
    public List<Category> getAllCategories() {
        return List.of();
    }

    @Override
    public Category addCategory(Category category) {
        return null;
    }

    @Override
    public Category updateCategory(Category category) {
        return null;
    }

    @Override
    public void deleteCategoryById(Long id) {

    }
}
