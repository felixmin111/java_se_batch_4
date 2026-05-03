package org.example.Day15.service;

import org.example.Day15.model.Product;
import org.example.Day15.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private static List<Product> products = new ArrayList<>();
    private ProductRepository repository;

    static {
        products.add(new Product(1, "Coffee", 2500, 10));
        products.add(new Product(2, "Tea", 1500, 20));
        products.add(new Product(3, "Cake", 3000, 5));
        products.add(new Product(4, "Coffee", 2500, 10));
        products.add(new Product(5, "Tea", 1500, 20));
        products.add(new Product(6, "Cake", 3000, 5));
    }
    public ProductService() {
        this.repository = new ProductRepository();
    }

    public List<Product> getAllProducts() {
         return repository.findAll();
    }

    public void save(Product product) {
       repository.save(product);
    }

    public Product getProductById(int id) {
        for (Product product : products) {
            if(product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public void deleteProductById(int id) {
        this.repository.deleteById(id);
    }

    public void updateProduct(Product product) {
       repository.update(product);
    }
}
