package com.company;

import java.util.ArrayList;

public class c_FibonacciSeries {
    public static void main(String[] args) {
        var series=fibonacciGenerator(7);
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
            list.add(0);
            list.add(1);
            for(int i=2;i<n;i++){
                list.add(list.get(list.size()-2)+ list.get(list.size()-1));
            }
        }
        return list;
    }
}

