package it.unibo.collections.comparators;

import java.util.Comparator;

public class CompareStringsAsDoubles implements Comparator<String>{

    /**
     * @return 1 if o1 > o2, 0 if o2 == o1, -1 otherwise
     */
    public int compare(final String s1, final String s2){
        return Double.compare(Double.parseDouble(s1), Double.parseDouble(s2));
    }
}
