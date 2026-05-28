package org.example.assigment.yuki.Day20.repository;

import org.example.Day20.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryEasy {
    public List<Product> findAll() {
        List<Product> list = new ArrayList<>();
        String sql = """
                SELECT
                    id,
                    name,
                    price,
                    quantity,
                FROM products
                ORDER BY id DESC
                """;
        try(Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()
        ) {
            while (rs.next()) {
                Product product = new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("price"),
                        rs.getInt("quantity")
                );
                list.add(product);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public void save(Product t) {
        String sql = "insert into products (name, price, quantity) values (?, ?, ?)";
        try(Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)
        ){
            ps.setString(1, t.getName());
            ps.setDouble(2, t.getPrice());
            ps.setInt(3, t.getQuantity());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                t.setId(rs.getInt(1));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void update(Product t) {
        String sql = "update products set name = ?, price = ?, quantity = ? where id = ?";
        try(Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ){
            ps.setString(1, t.getName());
            ps.setDouble(2, t.getPrice());
            ps.setInt(3, t.getQuantity());
            ps.setInt(4, t.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteById(int d){
        String sql = "delete from products where id = ?";
        try(Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ){
            ps.setInt(1, d);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Product findByName(String name){
        String sql = """
                SELECT id, name, price, quantity
                FROM products
                WHERE name = ?
                """;
        try(Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
        ){
          ps.setString(1, name);
          ResultSet rs = ps.executeQuery();
          if(rs.next()){
              return new Product(
                      rs.getInt("id"),
                      rs.getString("name"),
                      rs.getDouble("price"),
                      rs.getInt("quantity")
              );
          }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
