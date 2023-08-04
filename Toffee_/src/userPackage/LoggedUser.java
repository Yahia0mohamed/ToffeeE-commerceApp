package userPackage;
import java.util.*;
import DataHandeler.SQLDataBase;
import displayPackage.*;


public class LoggedUser extends User{
    private SQLDataBase db=new SQLDataBase();
    private Data info;
    private Catalog viewCatalog;
    private myCart cart;
    private Order myOrder;
    Scanner sin=new Scanner(System.in);

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
    public void setCart(myCart cart) {
        this.cart = cart;
    }

        /**
     * this function views the user the catalog of items
     */
    @Override
    public void viewCatalog() {
        int d;
        int i;
        while(true){
            viewCatalog.viewItems();
            System.out.println("1)add an item to cart\n2)proceed to making order\n3)exit");
            d=sin.nextInt();
            sin.nextLine();
            if(d==1){
                System.out.println("which item do you want:");
                i=sin.nextInt();
                sin.nextLine();
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
        System.out.println(viewCatalog.getItem(i-1).getName());
        System.out.print("enter the quantity: ");
        int am=sin.nextInt();
        if(am>50 && am<=0){
            System.out.println("not valid");
            addToCart(i); 
        }else{
            cart.addToCart(viewCatalog.getItem(i-1), am);
            System.out.println("item added");
        }
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
