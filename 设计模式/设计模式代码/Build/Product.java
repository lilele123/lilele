package Build;

import java.util.ArrayList;
import java.util.List;

//具体产品类
public class Product {

	List<String> partsList = new ArrayList<String>();
    public void Add(String part){
        partsList.add(part);

    }
    public void Show(){
        System.out.println("\n产品  创建----");
        for (String part :partsList){
            System.out.println(part);
        }
    }

}
