import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ToffeeWebsite {

    public static void main(String[] args) {
        String URL="jdbc:sqlserver://localhost:1433;databaseName=store";
        String username="MyProject";
        String password="1234";
        try {
            Connection test=DriverManager.getConnection(URL, username, password); 
            System.out.println("yes we did it");
        } catch (SQLException e) {
            System.out.println("nooo error");
        }
    }
}