import userPackage.LoggedUser;
import userPackage.UnLoggedUser;

public class ToffeeWebsite {

    public static void main(String[] args){
        UnLoggedUser me=new UnLoggedUser();
        me.viewCatalog();
        LoggedUser me1=me.login();
        System.out.println(me1.getData().ReturnInfo());
        me1.viewCatalog();
	}
}