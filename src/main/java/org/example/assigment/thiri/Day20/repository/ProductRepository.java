package org.example.assigment.thiri.Day20.repository;

import org.example.assigment.thiri.Day20.model.Category;
import org.example.assigment.thiri.Day20.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    public List<Product> findAll() {
        List<Product> list = new ArrayList<>();
        String sql="""
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
        try(Connection conn= DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery()
        ){
            while(rs.next()){
                Category category = new Category(
                        rs.getInt("category_id"),
                        rs.getString("category_name"),
                        rs.getString("category_description"),
                        rs.getString("category_code")
                );

                list.add(new Product(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("price"),
                        rs.getInt("quantity"),
                        category));
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    public Product save(Product product) {
        String sql="insert into products(name,price,quantity,category_id) values(?,?,?,?)";
        try(Connection conn= DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)
        ) {
            ps.setString(1, product.getName());
            ps.setDouble(2, product.getPrice());
            ps.setInt(3, product.getQuantity());
            ps.setInt(4, product.getProductCategory().getId());
            ps.executeQuery();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                product.setId(rs.getInt(1));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return product;
    }

    public void update(Product product) {
        String sql="update products set name=?,price=?,quantity=?, category_id=? where id=?";
        try(Connection conn= DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql)){
            ps.setString(1, product.getName());
            ps.setDouble(2, product.getPrice());
            ps.setInt(3, product.getQuantity());
            ps.setInt(4, product.getProductCategory().getId());
            ps.setInt(5, product.getId());
            ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteById(int id){
        String sql="delete from products where id=?";
        try(
                Connection conn= DBConnection.getConnection();
                PreparedStatement ps=conn.prepareStatement(sql)
        ){
            ps.setInt(1,id);
            ps.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public List<Product> search(String keyword) {
        List<Product> list = new ArrayList<>();
        String sql = """
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

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            String searchValue = "%" + keyword + "%";

            ps.setString(1, searchValue);
            ps.setString(2, searchValue);
            ps.setString(3, searchValue);
            ps.setString(4, searchValue);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Category category = new Category(
                            rs.getInt("category_id"),
                            rs.getString("category_name"),
                            rs.getString("category_description"),
                            rs.getString("category_code")
                    );

                    list.add(new Product(rs.getInt("id"),
                            rs.getString("name"),
                            rs.getDouble("price"),
                            rs.getInt("quantity"),
                            category));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

}
