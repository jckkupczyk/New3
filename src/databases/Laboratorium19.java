package databases;

// Napisz program, który korzystając z bazy danych AdventureWorks wyświetli podstawowe
// dane 10. pierwszych osób (Person.Contact), którzy mają na nazwisko „Anderson” - imię, nazwisko, e-mail.

// Dokonaj modyfikacji powyższego programu, aby można było wyszukiwać osoby podając początek nazwiska.

import java.sql.*;

public class Laboratorium19 {

        public static void main(String[] args) {
            String connectionUrl = "jdbc:sqlserver://morfeusz.wszib.edu.pl;encrypt=true;databaseName=AdventureWorks;user=jkupczyk;password=*****;trustServerCertificate=true";
            try (Connection con = DriverManager.getConnection(connectionUrl);
                 Statement stmt = con.createStatement();) {

                String sql = "select top 10 firstName, LastName, EmailAddress from Person.Contact";
                ResultSet rs = stmt.executeQuery(sql);

                while(rs.next()) {
                    System.out.println(rs.getString("FirstName") + ", " + rs.getString("LastName") + ", " + rs.getString("EmailAddress"));
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


}
