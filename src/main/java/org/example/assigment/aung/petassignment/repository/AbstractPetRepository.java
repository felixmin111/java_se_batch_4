package org.example.assigment.aung.petassignment.repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPetRepository<T> {
    
    protected abstract String getInsertSql();
    protected abstract void setInsertParam(PreparedStatement preparedStatement, T t) throws SQLException;
    
    protected abstract String getFindAllSql();
    
    protected abstract String getUpdateSql();
    protected abstract void setUpdateParam(PreparedStatement preparedStatement, T t) throws SQLException;
    
    protected abstract String getDeleteSql();
    
    protected abstract T mapRow(ResultSet rs) throws SQLException;

    public List<T> findAll() {
        List<T> list = new ArrayList<>();
        String sql = getFindAllSql();
        try (Connection conn = DBConnection_pet.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {
            
            while (rs.next()) {
                list.add(mapRow(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void save(T t) {
        String sql = getInsertSql();
        try (Connection conn = DBConnection_pet.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {
            
            setInsertParam(ps, t);
            ps.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(T t) {
        String sql = getUpdateSql();
        try (Connection conn = DBConnection_pet.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {
            
            setUpdateParam(ps, t);
            ps.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteById(String id) {
        String sql = getDeleteSql();
        try (Connection conn = DBConnection_pet.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
