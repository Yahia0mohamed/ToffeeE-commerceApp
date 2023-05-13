package displayPackage;

public class Item {
    private String name;
    private float price;
    private float discountVal;
    private int storedNum;
    private short loyaltyPoints;
    private String itemID;
    public Item(){}
    public Item(String n,float p,String id,float d,int s){
        this.name=n;
        this.price=p;
        this.itemID=id;
        this.discountVal=d;
        this.storedNum=s;
    }
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public float getPrice(){return price;}
    public void setPrice(float price){this.price=price;}
    public float getDiscount(){return discountVal;}
    public void setDiscount(float discount){this.discountVal=discount;}
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
    public void setID(String id){
        this.itemID=id;
    }
    public String getID(){
        return itemID;
    }
}
