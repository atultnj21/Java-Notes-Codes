/* Linked List
   : For fast insertion/Deletion */
package com.JavaCollection;

import java.util.LinkedList;

public class JavaLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(12);
        l1.add(13);
        l1.add(14);
        l1.add(15);
        l1.add(11);
        l1.add(1,18);
        System.out.println(l1);//[12, 18, 13, 14, 15, 11]
        System.out.println(l1.contains(15));//true
        System.out.println(l1.indexOf(15));//4
        l1.set(5,13);
        System.out.println(l1);//[12, 18, 13, 14, 15, 13]
        System.out.println(l1.lastIndexOf(13));//5
        l1.addLast(2);
        System.out.println(l1);//[12, 18, 13, 14, 15, 13, 2]
        l1.addFirst(2);
        System.out.println(l1);//[2, 12, 18, 13, 14, 15, 13, 2]
    }
}
