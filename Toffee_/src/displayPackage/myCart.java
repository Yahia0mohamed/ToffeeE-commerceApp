package displayPackage;
import java.util.HashMap;

public class myCart {
    private HashMap<Item,Integer> Items=new HashMap<Item,Integer>();
    
    public void addToCart(Item i,int n){
        Items.put(i,n);
    }
}
