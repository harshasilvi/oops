package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args){
        HashSet<String> set= new HashSet();
        set.add("harsha");
        set.add("silvi");
        set.add("har66sha");
        set.add("ann");
        set.add("harsha");
        System.out.println(set);
        System.out.println(set.size());

        TreeSet<String> tset = new TreeSet<>();
        tset.addAll(set);
        System.out.println(tset);




    }
}
