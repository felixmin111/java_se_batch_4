package org.example.assigment.aung.ATM;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class AccountRepository {

    public Account login(String accNo, String pin) {
        String sql = "SELECT acc_no, name, pin, balance, account_type_id FROM accounts WHERE acc_no = ? AND pin = ?";

        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, accNo);
            ps.setString(2, pin);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {                  
                    return new Account(
                        rs.getString("acc_no"),
                        rs.getString("name"),
                        rs.getString("pin"),
                        rs.getDouble("balance"),
                        rs.getString("account_type_id")
                    );
                }
            }
        } catch (SQLException e) {
            System.out.println("Database Error during login: " + e.getMessage());
        }
        return null;
    }

    public Map<String, AccountType> getAllAccountTypes() {
        Map<String, AccountType> types = new HashMap<>();
        String sql = "SELECT id, name, withdraw_limit FROM account_types";

        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                AccountType type = new AccountType(
                    rs.getString("id"),
                    rs.getString("name"),
                    rs.getDouble("withdraw_limit")
                );
                types.put(type.getId(), type);
            }
        } catch (SQLException e) {
            System.out.println("Error fetching account types: " + e.getMessage());
        }
        return types;
    }

    public void updateBalance(String accNo, double newBalance) {
        String sql = "UPDATE accounts SET balance = ? WHERE acc_no = ?";

        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setDouble(1, newBalance);
            ps.setString(2, accNo);
            ps.executeUpdate(); 

        } catch (SQLException e) {
            System.out.println("Error updating balance in DB: " + e.getMessage());
        }
    }
}
