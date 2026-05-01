package org.example.Day15.service;

import org.example.Day15.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Coffee", 2500, 10));
        products.add(new Product(2, "Tea", 1500, 20));
        products.add(new Product(3, "Cake", 3000, 5));
        products.add(new Product(4, "Coffee", 2500, 10));
        products.add(new Product(5, "Tea", 1500, 20));
        products.add(new Product(6, "Cake", 3000, 5));
    }

    public List<Product> getAllProducts() {
         return products;

    }

    public void save(Product product) {
        products.add(product);
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
        for (Product product : products) {
            if(product.getId() == id) {
                products.remove(product);
            }
        }
    }

    public void updateProduct(Product product) {
        products.set(products.indexOf(product), product);
    }
}
