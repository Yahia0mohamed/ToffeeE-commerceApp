package DataHandeler;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import userPackage.*;

public class SQLDataBase {
    Connection DataBase;
    public SQLDataBase(){
        String URL="jdbc:sqlserver://localhost:1433;databaseName=store";
        String username="MyProject";
        String password="1234";
        try {
            this.DataBase=DriverManager.getConnection(URL, username, password); 
            System.out.println("yes we did it");
        } catch (SQLException e) {
            System.out.println("nooo error");
        }
    }
    /**
     * this function saves user to database
     * @param d
     */
    public void saveUser(Data d){
        String name;
        String address=d.getAddress();
        String email=d.getEmail();
        String pass=d.getPass();
        String Query="";
        try{
            PreparedStatement sql=DataBase.prepareStatement(Query);
            sql.executeUpdate();
            System.out.println("1 row affected");
        }catch(SQLException e){
            System.out.println("none changed");
        }
    }
}
