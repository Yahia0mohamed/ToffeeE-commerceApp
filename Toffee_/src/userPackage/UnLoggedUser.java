package userPackage;

public class UnLoggedUser extends User {
    /**
     * this function is for any user to login
     */
    @Override
    public void login() {

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
