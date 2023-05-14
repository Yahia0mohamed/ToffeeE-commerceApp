package displayPackage;
import java.util.HashMap;
import java.util.Scanner;

public class myCart {
    private HashMap<Item,Integer> Items=new HashMap<Item,Integer>();
    
    public void addToCart(Item i,int n){
        System.out.println(i.getName());
        System.out.print("enter the quantity: ");
        Scanner sin=new Scanner(System.in);
        n=sin.nextInt();
        Items.put(i,n);
        sin.close();
    }
    public HashMap<Item,Integer> getCart(){
        return Items;
    }
}
