package org.example.Day17.repository;

import org.example.Day17.model.Product;
import org.example.Day17.model.ProductCategory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRepository extends AbstractRepository<Product> {
    @Override
    protected String getInsertSql() {
        return "insert into products(name,price,quantity) values(?,?,?)";
    }

    @Override
    protected void setInsertParam(PreparedStatement preparedStatement, Product product) throws SQLException {
        preparedStatement.setString(1, product.getName());
        preparedStatement.setDouble(2, product.getPrice());
        preparedStatement.setInt(3, product.getQuantity());

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
        return "update products set name=?,price=?,quantity=? where id=?";
    }

    @Override
    protected void setUpdateParam(PreparedStatement preparedStatement, Product product) throws SQLException {
        preparedStatement.setString(1, product.getName());
        preparedStatement.setDouble(2, product.getPrice());
        preparedStatement.setInt(3, product.getQuantity());
        preparedStatement.setInt(4, product.getId());
    }

    @Override
    protected String getDeleteSql() {
        return "delete from products where id=?";
    }

    @Override
    protected Product mapRow(ResultSet rs) throws SQLException{
        ProductCategory category = new ProductCategory(
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


}
