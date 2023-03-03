package com.example.demo.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Addition {

    private Connection connect() {
        String url = "jdbc:sqlite:C://Dogcare.db";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }


    public void insert(String name, String document, String address, String pet) {
        String sql = "INSERT INTO Clients(name, document, address, pet) VALUES(?,?,?,?)";

        try {
            Connection connection = this.connect();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, document);
            pstmt.setString(3, address);
            pstmt.setString(4, pet);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void reserve(String document_reserve, String pet_name, String reserve_date) {
        String sqlReserve = "INSERT INTO Reserves(document_reserve, pet_name, reserve_date) VALUES(?,?,?)";

        try {
            Connection connection = this.connect();
            PreparedStatement pstmt = connection.prepareStatement(sqlReserve);
            pstmt.setString(1, document_reserve);
            pstmt.setString(2, pet_name);
            pstmt.setString(3, reserve_date);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}