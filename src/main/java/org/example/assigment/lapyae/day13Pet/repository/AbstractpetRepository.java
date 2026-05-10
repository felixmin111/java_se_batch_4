package org.example.assigment.lapyae.day13Pet.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractpetRepository<T> {
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
        try (Connection conn = DBConnectionRepository.getConnection();
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
        try (Connection conn = DBConnectionRepository.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            setInsertParam(ps, t);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(T t) {
        String sql = getUpdateSql();
        try (Connection conn = DBConnectionRepository.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            setUpdateParam(ps, t);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteById(String id) {
        String sql = getDeleteSql();
        try (Connection conn = DBConnectionRepository.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, Integer.parseInt(id));
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
