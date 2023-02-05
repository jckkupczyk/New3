package databases;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDataSource {
    public static void main(String[] args) {

//        SQLServerDataSource ds = new SQLServerDataSource();
//        ds.setUser("jkupczyk");
//        ds.setPassword("********"); //uwaga! nie komitować do repo!
//        ds.setServerName("morfeusz.wszib.edu.pl");
//        ds.setPortNumber(1433);
//        ds.setDatabaseName("AdventureWorks");
//        ds.setTrustServerCertificate(true);
//
//        String sql = "select * from Forum.Topics";
//
////        String topicBody;
////        int id;
////
////        while (rs.next()) {
////            if (topicBody = rs.getString("TopicBody")) !=null) {
////                id = rs.getInt("ID");
////                System.out.println(id + " - " + topicBody);
////            }
//
//
//        try (Connection con = ds.getConnection();
//             Statement stmt = con.createStatement()) {
//            ResultSet rs = stmt.executeQuery(sql);
//
//
//            {
//
//
//            } catch(SQLException e){
//                System.out.println("Wystąpił problem z bazą danych: " + e.getMessage() + " : " + e.getSQLState());
//            }
//
//
//        }
    }}
