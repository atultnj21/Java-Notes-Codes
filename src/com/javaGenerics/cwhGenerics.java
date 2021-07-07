package com.javaGenerics;

import java.util.ArrayList;

public class cwhGenerics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList =new ArrayList();
        arrayList.add(54);
        arrayList.add(643);
//        arrayList.add("niknn");
        int a = arrayList.get(0);
        System.out.println(a);
    }
}
