package displayPackage;
import java.util.HashMap;

import DataHandeler.SQLDataBase;

import java.util.ArrayList;

public class Catalog {
    ArrayList<Item> Orders = new ArrayList<Item>();
    HashMap<String,Item> items=new HashMap<String,Item>();
    SQLDataBase mydb;
    public void refreshCatalog (){
        
    }
    public void viewItems(){}
    //public Item getItem(int id){}
    //public void viewItemDetails(int id){}
    public void sortByPrice(){}
    //public void loadCataloge(Item[]);
    public void addItem(){}
    public void deleteItem(){}
    public void viewCatagories(){}
    public void loadWithCatigoy(String catagory){}
}
