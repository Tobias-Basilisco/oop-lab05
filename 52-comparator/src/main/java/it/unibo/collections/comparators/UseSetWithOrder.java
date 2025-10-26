package it.unibo.collections.comparators;

import java.util.Set;
import java.util.TreeSet;

/**
 * 
 */
public final class UseSetWithOrder {

    private UseSetWithOrder() {
    }

    /**
     * @param s
     *            ignored
     */
    public static void main(final String[] s) {

        /*
         * Write a program which:
         * 
         * 1) Creates a new ORDERED TreeSet of Strings.
         * To order the set, define a new Comparator in a separate class.
         * The comparator must convert the strings to double, then compare the doubles to find the biggest.
         * The comparator does not need to deal with the case of Strings which are not parseable as doubles.
         */
        Set<String> set = new TreeSet<>(new CompareStringsAsDoubles());
        /*
         * 2) Inserts in the set a hundred strings containing randomly generated numbers
         * (use Math.random(), and convert to String appropriately)
         */
        // System.out.println(Math.random());
        for (int i = 1; i <= 100; i++){
            set.add(Double.toString(Math.random() * 100));
        }
        /*
         * 3) Prints the set, which must be ordered
         */
        System.out.print(set);
    }
}
