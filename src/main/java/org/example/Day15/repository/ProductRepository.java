package org.example.Day15.repository;

import org.example.Day15.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        String sql="select id,name,price,quantity from products order by id desc";
        try(Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery()
        ){
            while(rs.next()){
                Product product=new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("price"),
                        rs.getInt("quantity")
                );
                products.add(product);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return products;
    }
    public void save(Product product) {
        String sql="insert into products(name,price,quantity) values(?,?,?)";
        try(Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)
        ) {
            ps.setString(1, product.getName());
            ps.setDouble(2, product.getPrice());
            ps.setInt(3, product.getQuantity());

            ps.executeQuery();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                product.setId(rs.getInt(1));
            }
        }catch(SQLException e){
                e.printStackTrace();
            }
    }
    public void update(Product product) {
        String sql="update products set name=?,price=?,quantity=? where id=?";
        try(Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(sql)){
            ps.setString(1,product.getName());
            ps.setDouble(2,product.getPrice());
            ps.setInt(3,product.getQuantity());
            ps.setInt(4,product.getId());

            ps.executeQuery();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void deleteById(int id){
        String sql="delete from products where id=?";
        try(
                Connection conn=DBConnection.getConnection();
                PreparedStatement ps=conn.prepareStatement(sql)
        ){
            ps.setInt(1,id);
            ps.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }

    }


}
