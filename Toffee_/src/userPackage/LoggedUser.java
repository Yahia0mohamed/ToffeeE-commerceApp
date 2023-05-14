package userPackage;
import java.util.*;
import DataHandeler.SQLDataBase;
import displayPackage.*;


public class LoggedUser implements User{
    private SQLDataBase db=new SQLDataBase();
    private Data info;
    private Catalog viewCatalog;
    private myCart cart;
    private Order myOrder;

    public LoggedUser(){
        viewCatalog=new Catalog();
        viewCatalog.loadCataloge(db.loadCataloge());
        cart =new myCart();
        myOrder=new Order();
    }
    public LoggedUser(Data d){
        viewCatalog=new Catalog();
        this.info=d;
        viewCatalog.loadCataloge(db.loadCataloge());
        cart =new myCart();
        myOrder=new Order();
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
        //
    }

    /**
     * this function views the user the catalog of items
     */
    @Override
    public void viewCatalog(Scanner sin) {
        int d;
        int i;
        while(true){
            viewCatalog.viewItems();
            System.out.println("1)add an item to cart\n2)proceed to making order\n3)exit");
            d=sin.nextInt();
            if(d==1){
                System.out.println("which item do you want:");
                i=sin.nextInt();
                addToCart(i);
            }else if(d==2){
                makeOrder();
            }else{
                System.exit(0);
            }
        }
    }
    /**
     * this order adds elements to the cart of the user
     * @param i index
     */
    public void addToCart(int i){
        cart.addToCart(viewCatalog.getItem(i-1), i);
        System.out.println("item added");
        return;
    }
    /**
     * this 
     */
    public void makeOrder(){
        System.out.print("\033c");
        myOrder.setCart(this.cart);
        myOrder.calculatePrice();
        System.out.println("the order price will be: "+myOrder.getPrice());
        System.out.println("proceed to payment:");
        myOrder.orderStart();
        db.saveOrder(this.getData().getId(), myOrder);
    }
}
