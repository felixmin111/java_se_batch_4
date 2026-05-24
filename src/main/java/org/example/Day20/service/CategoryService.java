package org.example.Day20.service;

import org.example.Day20.model.Category;
import org.example.Day20.repository.CategoryRepository;

import java.util.List;

public class CategoryService {
    private CategoryRepository repository;

    public CategoryService() {
        this.repository = new CategoryRepository();
    }

    public List<Category> getAllCategories() {
         return repository.findAll();
    }

    public void save(Category productCategory) {
       repository.save(productCategory);
    }

    public void deleteCategoryById(int id) {
        this.repository.deleteById(id);
    }

    public void updateCategory(Category productCategory) {
       repository.update(productCategory);
    }

    public Category getCategoryByName(String name) {
        return repository.findByName(name);

    }
}
