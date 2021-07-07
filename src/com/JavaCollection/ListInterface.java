/* List interface
   represents an ordered collection also called sequence
   can access object by index */

/* ArrayList */
package com.JavaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        // overloaded method
        list.add(0,"!");
        Collections.addAll(list,"d","e");
        System.out.println(list);//[!, a, b, c, d, e]

        // get object by index
        System.out.println(list.get(0));//!

        // replace
        list.set(1,"a+");
        System.out.println(list);//[!, a+, b, c, d, e]

        // remove using index
        list.remove(1);
        System.out.println(list);//[!, b, c, d, e]

        // indexOf
        System.out.println(list.indexOf("b"));// 1
        System.out.println(list.indexOf("a"));//-1

        // lastIndexOf
        list.add("b");
        System.out.println(list);//[!, b, c, d, e, b]
        System.out.println(list.lastIndexOf("b"));//5

        // subList
        System.out.println(list.subList(1,3));//[b,c]
    }
}
