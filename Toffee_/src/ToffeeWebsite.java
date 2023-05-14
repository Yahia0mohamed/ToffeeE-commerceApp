import userPackage.LoggedUser;

import java.util.Scanner;

import DataHandeler.SQLDataBase;;

public class ToffeeWebsite {

    public static void main(String[] args){
        SQLDataBase db=new SQLDataBase();
        LoggedUser me=new LoggedUser(db.loadUser("yahia.edu500@gmail.com","500500"));
        Scanner n=new Scanner(System.in);
        me.viewCatalog(n);
	}
    
}