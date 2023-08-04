package displayPackage;
import Payment.*;
import java.util.*;
import java.util.HashMap;

public class Order {
    private boolean PaymentState;
    private Payment payment;
    private double price;
    private String address;
    private boolean delivered;
    private myCart cart;
    private String phoneString;
    private Scanner sin=new Scanner(System.in);

    /**
     * sets the cart of the user to the order
     * @param cart
     */
    public void setCart(myCart cart) {
        this.cart = cart;
    }
    /**
     * gets the payment state of the order
     * @return
     */
    public boolean getP_State(){return PaymentState; }
    /**
     * \gets the payment type
     * @return the payment type
     */
    public Payment getP_Type(){return payment;}
    /**
     * get the address of the order
     * @return
     */
    public void setPhoneString(String phoneString) {
        this.phoneString = phoneString;
    }
    public String getPhoneString() {
        return phoneString;
    }
    public String getAddress(){return address;}
    /**
     * sets the address of the order
     * @param address
     */
    public void setAddress(String address){this.address=address;}
    /**
     * the user choose the payment method from this function
     */
    public void choosePaymentMethod(){
        
        System.out.println("choose a payment method\n1)Cash\n2)E_wallets\n3)Loyaly Points\n4)Vouchers");
        int choice = sin.nextInt();
        if(choice == 1){
            payment=new Cash();
        }else{
            System.out.println("only cash is available.");
            choosePaymentMethod();
        }
    }
    /**
     * this function return the price of the order
     * @return
     */
    public double getPrice(){
        return price;
    }
    /**
     * this function set the price of the whole order
     * @param p
     */
    public void setPrice(Double p){
        this.price=p;
    }
    /**
     * this function calculate the price of the order from the cart
     */
    public void calculatePrice(){
        HashMap<Item,Integer> Items=cart.getCart();
        for (Map.Entry<Item,Integer> i : Items.entrySet()) {
            price+=(i.getKey().getPrice()*i.getValue());
        }
    }
    public boolean getState(){
        return delivered;
    }

    public void orderStart(){
        System.out.println("Do you want to confirm this order?\n1)Yes  2)No");
        int o = sin.nextInt();
        if(o==1){
            choosePaymentMethod();
            payment.startPayment();
        }else{
            System.exit(0);
        }
    }
}
