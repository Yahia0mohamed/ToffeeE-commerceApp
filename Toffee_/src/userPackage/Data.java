package userPackage;

/**
 * this class is to make Users data abstract and separate from the reach
 */
public class Data {
    private String Email;
    private String pass;
    private String Address;

    /**
     * this function get the email from the object
     * @return String
     */
    public String getEmail() {
        return Email;
    }

    /**
     * sets the email in the object
     * @param email String to handel the email
     */
    public void setEmail(String email) {
        Email = email;
    }

    /**
     * this function gets the password from the object
     * @return String
     */
    public String getPass() {
        return pass;
    }

    /**
     * Sets the password in the object
     * @param pass String to handel the password
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * this function gets the address from the object
     * @return String
     */
    public String getAddress() {
        return Address;
    }

    /**
     * Sets the address in the object
     * @param address String
     */
    public void setAddress(String address) {
        Address = address;
    }
}
