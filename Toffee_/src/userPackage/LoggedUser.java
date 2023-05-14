package userPackage;
import DataHandeler.SQLDataBase;
import displayPackage.*;
public class LoggedUser extends User{
    private SQLDataBase db=new SQLDataBase();
    private Data info;
    private Catalog viewCatalog;

    public LoggedUser(Data d){
        this.info=d;
    }
    public Data getData(){
        return info;
    }
    /**
     * this function is for any user to login
     */
    @Override
    public LoggedUser login() {
        return new LoggedUser(new Data());
    }

    /**
     * this function is to register a new user to the system
     */
    @Override
    public void registration() {
        
    }

    /**
     * this function views the user the catalog of items
     */
    @Override
    public void viewCatalog() {
        
    }
}
