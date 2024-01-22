package collections;

import java.util.Comparator;

public class Comparable_Comparator implements Comparator<Sort> {
    @Override
    public int compare(Sort o1, Sort o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
