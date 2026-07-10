package org.example.Day20.repository;

import org.example.Day20.model.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository {

    public List<Category> findAll() {
        List<Category> list = new ArrayList<>();
        String sql="""
           SELECT 
               id,
               name,
               description,
               code
           FROM categories
           ORDER BY id DESC
           """;
        try(Connection conn= DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery()
        ){
            while(rs.next()){
                Category category = new Category(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getString("code")
                );
                list.add(category);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    public void save(Category t) {
        String sql="insert into categories(name,description,code) values(?,?,?)";
        try(Connection conn= DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)
        ) {
            ps.setString(1, t.getName());
            ps.setString(2, t.getDescription());
            ps.setString(3, t.getCode());
            //is for the saving data to db
            ps.executeQuery();
            //this one finished the save process in db
            ResultSet rs = ps.getGeneratedKeys();
            //this one get the generated key
            if (rs.next()) {
                t.setId(rs.getInt(1));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void update(Category t) {
        String sql="update categories set name=?,description=?,code=? where id=?";
        try(Connection conn= DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql)){

            ps.setString(1,t.getName());
            ps.setString(2, t.getDescription());
            ps.setString(3, t.getCode());
            ps.setInt(4, t.getId());
            //Update or deleting the existence data in db
            ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteById(int id){
        String sql="delete from categories where id=?";
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

    public Category findByName(String name) {
        String sql="""
           SELECT id, name, description, code
           FROM categories
           WHERE name = ?
           """;
        try(Connection conn= DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
        ){
            ps.setString(1,name);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Category category = new Category(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getString("code")
                );
                return category;
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }


}
