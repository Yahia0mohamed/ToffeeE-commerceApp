package userPackage;
import java.util.Scanner;

import DataHandeler.SQLDataBase;

public class UnLoggedUser extends User {
    /**
     * this function is for any user to login
     */
    @Override
    public void login() {
        Scanner sin=new Scanner(System.in);
        System.out.print("enter the email:");
        String email=sin.nextLine();
        System.out.println("enter the password");
        String password=sin.nextLine();
        SQLDataBase db=new SQLDataBase();
        db.loadUser(email, password);
        
        sin.close();
    }

    /**
     * this function is to register a new user to the system
     */
    @Override
    public Data registration() {
        return new Data();
    }

    /**
     * this function views the user the catalog of items
     */
    @Override
    public void viewCatalog() {

    }
}
