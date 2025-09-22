//package main.java.org.dbdemo;
//
//import java.sql.*;
//
//public class GetConnection {
//
//    public static void main(String[] args) {
//        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
//             PreparedStatement ps = con.prepareStatement("SELECT NOW()");
//             ResultSet rs = ps.executeQuery()) {
//
//            if (rs.next()) {
//                System.out.println("DB connected! Current time: " + rs.getString(1));
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
