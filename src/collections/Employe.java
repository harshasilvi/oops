package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Employe {
    public static void main(String[] args){
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(12);
        marks.add(122);
        marks.add(132);
        marks.add(112);
        Collections.sort(marks);
        System.out.println(marks);
//comparable
        ArrayList<Sort> emp = new ArrayList<>();
        emp.add(new Sort("harsha=","12",23));
        emp.add(new Sort("saumya","132",2));
        emp.add(new Sort("lvi","124",3));
        emp.add(new Sort("golid","125",13));
        Collections.sort(emp);
        System.out.println(emp);
        System.out.println("hi");

//comparator
        ArrayList<Sort> emp1 = new ArrayList<>();
        emp.add(new Sort("harsha","12",23));
        emp.add(new Sort("saumya","132",2));
        emp.add(new Sort("silvi","124",3));
        emp.add(new Sort("golid","125",13));
        Collections.sort(emp1, new Comparable_Comparator());
        System.out.println(emp1);




    }
}
