package com.JavaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class usingAnonymousClass {
    public static void main(String[] args) {

        List<Integer> values = new ArrayList<>();
        Collections.addAll(values,305,998,774,236,881);
        System.out.println(values);
        //[305, 998, 774, 236, 881]

        //to sort values in collection
        Collections.sort(values);
        System.out.println(values);
        //[236, 305, 774, 881, 998]

        //let's say i want to sort it according to the last digit
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 % 10 > o2 % 10)
                    return 1;//swap
                else
                    return -1;//dont swap
            }
        };
        //We can also do this using lambda expression


        Collections.sort(values,com);
        System.out.println(values);
        //[881, 774, 305, 236, 998]
    }
}
