package userPackage;
import java.util.Scanner;

import DataHandeler.SQLDataBase;

public class UnLoggedUser extends User {
    private SQLDataBase db=new SQLDataBase();
    /**
     * this function is for any user to login
     */
    @Override
    public LoggedUser login() {
        try (Scanner sin = new Scanner(System.in)) {
            System.out.print("enter the email: ");
            String email=sin.nextLine();
            System.out.print("enter the password: ");
            String password=sin.nextLine();
            Data t=new Data(db.loadUser(email, password));
            if(t.getName()==null){
                System.out.println("wrong password or email");
                return login();
            }else{
                return new LoggedUser(t);
            }
        }
    }

    /**
     * this function is to register a new user to the system
     */
    @Override
    public void registration() {
        try (Scanner sin = new Scanner(System.in)){
            System.out.print("enter the email: ");
            String email=sin.nextLine();
            System.out.print("enter the address: ");
            String address=sin.nextLine();
            System.out.print("enter phone number: ");
            String pnum=sin.nextLine();
            System.out.print("enter your name: ");
            String name=sin.nextLine();
            System.out.print("enter the password: ");
            String pass=sin.nextLine();
            Data d=new Data(name, email, address, pass, pnum);
            db.saveUser(d);
        }
    }

    /**
     * this function views the user the catalog of items
     */
    @Override
    public void viewCatalog() {

    }
}
