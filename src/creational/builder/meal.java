package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class meal {

    private List<item> list= new ArrayList<>();

    public void addItem(item e){
        list.add(e);
    }

    public float getCost(){
        float cost = 0.0f;
        for(item i:list){
            cost += i.price();
        }
        return cost;
    }

    public void showItems(){
        for(item i:list){
            System.out.print("item : "+i.name());
            System.out.print(",packing : "+i.packi().pack());
            System.out.print(",price : "+i.price());
        }
    }
}
