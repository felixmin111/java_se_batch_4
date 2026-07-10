package org.example.Day20.repository;

import org.example.Day20.model.Category;
import org.example.Day20.model.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRepository extends AbstractRepository<Product> {
    @Override
    protected String getInsertSql() {
        return "insert into products(name,price,quantity,category_id) values(?,?,?,?)";
    }

    @Override
    protected void setInsertParam(PreparedStatement preparedStatement, Product product) throws SQLException {
        preparedStatement.setString(1, product.getName());
        preparedStatement.setDouble(2, product.getPrice());
        preparedStatement.setInt(3, product.getQuantity());
        preparedStatement.setInt(4, product.getProductCategory().getId());

    }

    @Override
    protected void setGeneratedId(ResultSet rs, Product product) throws SQLException {
      product.setId(rs.getInt(1));
    }

    @Override
    protected String getFindAllSql() {
        return """
           SELECT 
               p.id,
               p.name,
               p.price,
               p.quantity,

               c.id AS category_id,
               c.name AS category_name,
               c.description AS category_description,
               c.code AS category_code

           FROM products p
           JOIN categories c
                ON p.category_id = c.id

           ORDER BY p.id DESC
           """;
    }

    @Override
    protected String getUpdateSql() {
        return "update products set name=?,price=?,quantity=?, category_id=? where id=?";
    }

    @Override
    protected void setUpdateParam(PreparedStatement preparedStatement, Product product) throws SQLException {
        preparedStatement.setString(1, product.getName());
        preparedStatement.setDouble(2, product.getPrice());
        preparedStatement.setInt(3, product.getQuantity());
        preparedStatement.setInt(4, product.getProductCategory().getId());
        preparedStatement.setInt(5, product.getId());
    }

    @Override
    protected String getDeleteSql() {
        return "delete from products where id=?";
    }

    @Override
    protected Product mapRow(ResultSet rs) throws SQLException{
        Category category = new Category(
                rs.getInt("category_id"),
                rs.getString("category_name"),
                rs.getString("category_description"),
                rs.getString("category_code")
        );

        return new Product(rs.getInt("id"),
                           rs.getString("name"),
                           rs.getDouble("price"),
                           rs.getInt("quantity"),
                           category);
    }
    @Override
    protected String getSearchSql() {
        return """
           SELECT 
               p.id,
               p.name,
               p.price,
               p.quantity,

               c.id AS category_id,
               c.name AS category_name,
               c.description AS category_description,
               c.code AS category_code

           FROM products p
           JOIN categories c
                ON p.category_id = c.id

           WHERE LOWER(p.name) LIKE LOWER(?)
              OR LOWER(c.name) LIKE LOWER(?)
              OR CAST(p.price AS TEXT) LIKE ?
              OR CAST(p.quantity AS TEXT) LIKE ?

           ORDER BY p.id DESC
           """;
    }



}
