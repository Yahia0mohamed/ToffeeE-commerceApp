package displayPackage;

public class Item {
    private String name;
    private double price;
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
    /**
     * this function get the name of the item
     * @return the item name
     */
    public String getName(){return name;}
    /**
     * this function sets the item name
     * @param name the item name
     */
    public void setName(String name){this.name=name;}
    /**
     * this function returns the price of the item
     * @return the item price
     */
    public double getPrice(){return price;}
    /**
     * this item sets the price of the item
     * @param price the item price
     */
    public void setPrice(Double price){this.price=price;}
    /**
     * this get the discount value over an item
     * @return
     */
    public float getDiscount(){return discountVal;}
    /**
     * this function sets the discount value
     * @param discount the item discount value
     */
    public void setDiscount(float discount){this.discountVal=discount;}
    /**
     * this function check the availbailty of item in the store 
     * @return if availabe or not
     */
    public boolean isAvailable(){
        if(storedNum!=0){
            return true;
        }
        return false;
    }
    /**
     * this function get the number of stored item
     * @return the item number
     */
    public int getStored(){
        return storedNum;
    }
    /**
     * this function set the stored num
     * @param storedNum
     */
    public void setStoredNum(int storedNum) {
        this.storedNum = storedNum;
    }
    /**
     * this function get the loyality points assigned to the item
     * @return the points
     */
    public short getLoyaltyPoints() {return loyaltyPoints;}
    /**
     * this function change the loyality point 
     * @param i the loyality points
     */
    public void changeLoyaltyPoints(short i){
        this.loyaltyPoints=i;
    }
    /**
     * this function sets the id of the item
     * @param id the id
     */
    public void setID(String id){
        this.itemID=id;
    }
    /**
     * this function get the id of the item
     * @return the id
     */
    public String getID(){
        return itemID;
    }
    
    public String itemInfo(){
        return "name: "+getName()+"\nprice: "+getPrice()+"\n"+getStored()+" left";
    }
}
