package displayPackage;
import java.util.ArrayList;

public class OrderList {
    private static int count = 0;
    public OrderList(){count++;}
    public int getCount(){return count;}
    ArrayList<Order> Orders = new ArrayList<Order>();
    public void loadOrders(){}
    public Order getOrder(int i){return Orders.get(i-1);}
}
