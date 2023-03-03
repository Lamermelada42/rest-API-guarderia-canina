package com.example.demo.database;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Search {

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

    public void selectClient(){
        String sql = "SELECT * FROM Clients";

        try {
            Connection connection = this.connect();
            Statement stmt  = connection.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);
            System.out.println("______Clientes______");
            while (rs.next()) {
                System.out.println(rs.getString("name") +  "\t" +
                        rs.getString("document") + "\t" +
                        rs.getString("address") + "\t" +
                        rs.getString("pet"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void selectReserve(){
        String sql = "SELECT * FROM Reserves ";

        try {
            Connection connection = this.connect();
            Statement stmt  = connection.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);
            System.out.println("_______Reservas________");
            while (rs.next()) {
                System.out.println(rs.getString("document_reserve") +  "\t" +
                        rs.getString("pet_name") + "\t" +
                        rs.getString("reserve_date"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}  