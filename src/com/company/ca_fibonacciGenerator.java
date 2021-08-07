package com.company;

import java.util.ArrayList;

public class ca_fibonacciGenerator {
    public static void main(String[] args) {
        var series=fibonacciGenerator(4);
        System.out.println(series);
    }
    public static ArrayList<Integer> fibonacciGenerator(int n){
        ArrayList<Integer> list = new ArrayList<>();
        if(n==1){
            list.add(0);
        }else if(n==2){
            list.add(0);
            list.add(1);
        } else{
            var firstItem=0;
            var secondItem=1;
            list.add(firstItem);
            list.add(secondItem);
            for(int i=2;i<n;i++){
                var nextItem =firstItem+secondItem;
                firstItem=secondItem;
                secondItem=nextItem;
                list.add(nextItem);
            }
        }
        return list;
    }
}
