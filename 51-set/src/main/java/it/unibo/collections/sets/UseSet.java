package it.unibo.collections.sets;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;


/**
 * Example class using {@link java.util.Set}.
 *
 */
public final class UseSet {

    private static final int ELEMS = 20;

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         *
         * 1) Builds a TreeSet containing Strings
         */
        final Set<String> set = new TreeSet<>();
        /*
         * 2) Populates such Collection with all the Strings representing numbers ranging from "1" to
         * "20" (both included)
         */
        for (int i = 1; i <= 20; i++){
            set.add(Integer.toString(i));
        }
        /*
         * 3) Prints its content
         */
        System.out.println("set: " + set);
        /*
         * 4) Removes all those strings whose represented number is divisible by three.
         * Note: the method removeIf(Predicate) is not allowed.
         */
        final var iterator = set.iterator();
        while (iterator.hasNext()){
            if(Integer.parseInt(iterator.next()) % 3 == 0){
                iterator.remove();
            }
        }
        /*
         * 5) Prints the content of the Set using a for-each construct
         */
        for (String elem : set){
            System.out.print(elem + ' ');
        }
        /*
         * 6) Verifies whether all the numbers left in the set are even
         */
        System.out.println("The numbers left in the set are " + (isOnlyEvenSet(set) ? "" : "not ") + "only even");

         
    }

    private static boolean isOnlyEvenSet(Set<String> set){
        var iterator = set.iterator();
        while(iterator.hasNext()){
            if(Integer.parseInt(iterator.next()) % 2 != 0){
                return false;
            }
        }
        return true;
    }
}
