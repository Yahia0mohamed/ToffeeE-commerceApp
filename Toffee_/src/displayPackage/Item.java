package displayPackage;
import java.util.ArrayList;

public abstract class Item {
    private String name;
    private float price;
    private float discountVal;
    private boolean discounted;
    ArrayList<String> catagory = new ArrayList<String>();
    private int storedNum;
    private short loyaltyPoints;
    private String itemID;
    
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public float getPrice(){return price;}
    public void setPrice(float price){this.price=price;}
    public float getDiscount(){return discountVal;}
    public void setDiscount(float discount){this.discountVal=discountVal;}
    public ArrayList<String> getCatagoty(){return catagory;}
    public void setCatagory( ArrayList<String> catagory){this.catagory=catagory;}
    public boolean isDiscounted(){
        int p=0;
        price=price*discountVal;
        if(p!=price){
            return true;
        }
        return false;
    }
    public boolean isAvailable(){
        if(storedNum!=0){
            return true;
        }
        return false;
    }    
    public void remove(int num){
        num--;
    }
    public short getLoyaltyPoints() {return loyaltyPoints;}
    public void changeLoyaltyPoints(){//
    }
}
