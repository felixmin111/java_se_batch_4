package org.example.Day17.controller;
import org.example.Day17.model.Product;
import org.example.Day17.service.ProductService;
import org.example.Day17.validator.NullValidator;
import org.example.Day17.view.ProductView;

import javax.swing.*;
import java.util.List;

public class ProductController {
    private ProductService productService;
    private ProductView productView;
    public ProductController(ProductService productService, ProductView productView) {
        this.productService = productService;
        this.productView = productView;
        this.productView.saveButton.addActionListener(e -> {saveProduct();});
        this.productView.updateButton.addActionListener(e->{updateProduct();});
        this.productView.deleteButton.addActionListener(e->{deleteProduct();});
        this.productView.table.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                fillFormFromSelectedRow();
            }
        });
        loadProducts();
    }
    private void loadProducts() {
        //Clean Old data
        productView.tableModel.setRowCount(0);

        List<Product> products=productService.getAllProducts();
        for (Product product : products) {
            productView.tableModel.addRow(new Object[]{
                    product.getId(),
                    product.getProductCategory().getName(),
                    product.getName(),
                    product.getPrice(),
                    product.getQuantity()
            });
        }

    }
    private void saveProduct() {
        try {
            System.out.println("Saving product");
            String name = productView.nameField.getText();
            double price = Double.parseDouble(productView.priceField.getText());
            int quantity = Integer.parseInt(productView.quantityField.getText());
            Product product = new Product(null, name, price, quantity);
            NullValidator.validate(product);
            productService.save(product);
            loadProducts();
            cleanForm();
            JOptionPane.showMessageDialog(productView.panel, "Product saved successfully");
        }catch (RuntimeException e) {
            JOptionPane.showMessageDialog(
                    productView.panel,
                    e.getMessage(),
                    "Validation error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cleanForm(){
        productView.idField.setText("");
        productView.nameField.setText("");
        productView.priceField.setText("");
        productView.quantityField.setText("");
    }
    private void fillFormFromSelectedRow() {
        int row = productView.table.getSelectedRow();

        if (row == -1) {
            return;
        }
        productView.idField.setText(productView.tableModel.getValueAt(row, 0).toString());
        productView.nameField.setText(productView.tableModel.getValueAt(row, 1).toString());
        productView.priceField.setText(productView.tableModel.getValueAt(row, 2).toString());
        productView.quantityField.setText(productView.tableModel.getValueAt(row, 3).toString());
    }
    private void updateProduct() {
        System.out.println("Update product");
        int id=Integer.parseInt(productView.idField.getText());
        String name=productView.nameField.getText();
        double price=Double.parseDouble(productView.priceField.getText());
        int quantity=Integer.parseInt(productView.quantityField.getText());
        Product product=new Product(id,name,price,quantity);
        productService.updateProduct(product);
        loadProducts();
        cleanForm();
    }
    private void deleteProduct() {
        int id=Integer.parseInt(productView.idField.getText());
        productService.deleteProductById(id);
        loadProducts();
        cleanForm();
    }

}
