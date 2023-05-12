package userPackage;
import displayPackage.*;
public class LoggedUser extends User{
    private OrderList orders;
    private int LPoints;
    private String customerID;

    /**
     * this function is for any user to login
     */
    @Override
    public void login() {
        return;
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
