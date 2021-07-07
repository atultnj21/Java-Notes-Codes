// a collection that contains no duplicate
// hashset -> a class that implements set  interface

/* http://www.java2s.com/example/java-book/set-union-intersection-difference-and-subset.html */
package com.JavaCollection;
import java.util.*;

public class setInterface {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("sky");
        set.add("is");
        set.add("blue");
        set.add ("blue");

        //Duplicates gone, set interface does not guarantee order
        System.out.println(set);//[sky, blue, is]

        //removing duplicates from our collection
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection,"a","b","c","c");
        Set<String> newSet = new HashSet<>(collection);
        System.out.println(newSet);//[a, b, c]

        Set<String> set1= new HashSet<>(Arrays.asList("a","b","c"));
        Set<String> set2= new HashSet<>(Arrays.asList("b","c","d"));

        //Union
        set1.addAll(set2);
        System.out.println(set1);//[a, b, c, d]

        //Intersection
        set1.retainAll(set2);
        System.out.println(set1);

        //Difference
        set1.removeAll(set2);

    }
}
