package displayPackage;
import java.util.ArrayList;

public class Catalog {
    ArrayList<Item> items = new ArrayList<Item>();
    public void viewItems(){
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i+1)+")");
            System.out.println(items.get(i).itemInfo());
            System.out.println("----------------------------------------------------");
        }
    }
    public Item getItem(int index){
        return items.get(index);
    }
    public void loadCataloge(ArrayList<Item> i){
        for (int j = 0; j < i.size(); j++) {
            items.add(i.get(j));
        }
    }
}
