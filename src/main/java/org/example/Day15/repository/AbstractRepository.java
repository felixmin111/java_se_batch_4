package org.example.Day15.repository;

import org.example.Day15.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractRepository<T>{
    protected abstract String getInsertSql();
    protected abstract void setInsertParam(PreparedStatement preparedStatement, T t)throws SQLException;
    protected abstract void setGeneratedId(ResultSet rs, T t)throws SQLException;
    protected abstract String getFindAllSql();
    protected abstract String getUpdateSql();
    protected abstract void setUpdateParam(PreparedStatement preparedStatement, T t)throws SQLException;
    protected abstract String getDeleteSql();
    protected abstract T mapRow(ResultSet rs)throws SQLException;
    public List<T> findAll() {
        List<T> list = new ArrayList<>();
        String sql=getFindAllSql();
        try(Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery()
        ){
            while(rs.next()){
               list.add(mapRow(rs));
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }
    public void save(T t) {
        String sql=getInsertSql();
        try(Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)
        ) {
            setInsertParam(ps,t);
            ps.executeQuery();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
               setGeneratedId(rs,t);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void update(T t) {
        String sql=getUpdateSql();
        try(Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql)){
            setUpdateParam(ps,t);
            ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void deleteById(int id){
        String sql=getDeleteSql();
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
