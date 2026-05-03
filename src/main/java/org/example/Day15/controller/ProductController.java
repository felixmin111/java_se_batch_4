package org.example.Day15.controller;
import org.example.Day15.model.Product;
import org.example.Day15.service.ProductService;
import org.example.Day15.view.ProductView;
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
                    product.getName(),
                    product.getPrice(),
                    product.getQuantity()
            });
        }

    }
    private void saveProduct() {
        System.out.println("Saving product");
        String name=productView.nameField.getText();
        double price=Double.parseDouble(productView.priceField.getText());
        int quantity=Integer.parseInt(productView.quantityField.getText());
        Product product=new Product(null,name,price,quantity);
        productService.save(product);
        loadProducts();
        cleanForm();
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
