package userPackage;

/**
 * this interface is for a general type as a user of the system
 * @author yahia
 */
public interface GeneralUser {
    /**
     * this function is for any user to login
     */
    void login();

    /**
     * this function is to register a new user to the system
     */
    Data registration();

    /**
     * this function views the user the catalog of items
     */
    void viewCatalog();
}
