package org.example.Day20.service;

import org.example.Day20.model.Product;
import org.example.Day20.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private static List<Product> products = new ArrayList<>();
    private ProductRepository repository;

    public ProductService() {
        this.repository = new ProductRepository();
    }

    public List<Product> getAllProducts() {
         return repository.findAll();
    }

    public void save(Product product) {
       repository.save(product);
    }

    public void deleteProductById(int id) {
        this.repository.deleteById(id);
    }

    public void updateProduct(Product product) {
       repository.update(product);
    }

    public List<Product> productSearch(String keyword) {
        return this.repository.search(keyword);
    }
}
