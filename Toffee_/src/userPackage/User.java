package userPackage;

import java.util.Scanner;

public interface User{
    /**
     * this function is to register a new user to the system
     */
    public LoggedUser login();
    /**
     * this function is to register a new user to the system
     */
    public void registration();
    /**
     * this function views the user the catalog of items
     */
    public void viewCatalog(Scanner sin);
}
