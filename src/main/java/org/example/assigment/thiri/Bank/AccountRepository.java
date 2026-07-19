package org.example.assigment.thiri.Bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountRepository {
    public Account login(String bankNo,String pin){
        String sql="""
                SELECT id, name, email, phone, address,
                       nrc, bank_no, pin, balance
                FROM accounts
                WHERE bank_no = ? AND pin = ?
                """;
        //Step 1 connection and prepareStatement
        try(Connection connection =
                        DatabaseConnection.getConnection();

                PreparedStatement statement =
                        connection.prepareStatement(sql)
        ){
            //Step2 set param for ?
            statement.setString(1, bankNo);
            statement.setString(2, pin);

            //Step3 Run
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return mapAccount(resultSet);
                }
            }


        }catch (SQLException e) {
            throw new RuntimeException(
                    "Failed to log in",
                    e
            );

        }
        return null;
    }
    private Account mapAccount(ResultSet resultSet)
            throws SQLException {

        Account account = new Account();

        account.setId(resultSet.getObject("id").toString());
        account.setName(resultSet.getString("name"));
        account.setEmail(resultSet.getString("email"));
        account.setPhone(resultSet.getString("phone"));
        account.setAddress(resultSet.getString("address"));
        account.setNrc(resultSet.getString("nrc"));
        account.setBankNo(resultSet.getString("bank_no"));
        account.setPin(resultSet.getString("pin"));
        account.setBalance(resultSet.getDouble("balance"));

        return account;
    }
}
