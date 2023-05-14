package userPackage;
import displayPackage.*;
public abstract class User{
    private Catalog ItemList;
    private Data info;
    /**
     * this function is to register a new user to the system
     */
    public abstract LoggedUser login();
    /**
     * this function is to register a new user to the system
     */
    public abstract void registration();
    /**
     * this function views the user the catalog of items
     */
    public abstract void viewCatalog();
}
