package collections;

import java.util.HashMap;

public class Map {
    public static void main (String[] args){

        HashMap<String,Integer> map = new HashMap();
        map.put("harsha",12);
        map.put("harsha",12);

        map.put("saumya",12);

        map.put("harsh66a",1662);
        System.out.println(map);

        map.forEach((key,value)->{
            System.out.print(key);
            System.out.print("=>");
            System.out.println(value);
        });



    }
}
