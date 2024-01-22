package collections;

import java.util.LinkedList;
import java.util.Vector;

public class ArrayList {
    public static void main(String[] args){

        //Type-safe
        java.util.ArrayList<String> arr =new java.util.ArrayList<>();
        arr.add("harsha");
        arr.add("silvi");
        arr.add("saumya");
       // arr.add(123);//ce errorjava: incompatible types: int cannot be converted to java.lang.String
        arr.add("saumya");

        arr.add("");
        System.out.println(arr);

        //untype-safe
//        LinkedList larr= new LinkedList();
//        larr.add("goldi");
//        larr.add(true)=;
//        larr.add(666.88);
//        larr.add(666.88);
//        System.out.println(-larr);
        arr.set(1,"goldi");
        arr.add(1,"ann");
        Vector v = new Vector();
        v.addAll(arr);
        System.out.println(arr);
        System.out.println(arr.size());
        System.out.println(arr.isEmpty());
       // System.out.printn(v);









    }
}
