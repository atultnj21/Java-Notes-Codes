package com.javaGenerics;

class List{
    private int count;
    private int[] items ;

    public List(int cap){
        this.items = new int[cap];
    }
    public void add(int number){
        items[count++]=number;
    }

    public int getIndex(int index){
        return items[index];
    }

    public void printList(){
        System.out.println("Printing List..");
        for(int element: items){
            System.out.println(element);
        }
    }
}
public class aNeedForGenerics {
    public static void main(String[] args) {
        List l = new List(10);
        l.add(5);
        l.add(4);
        l.add(3);
        l.add(6);
        System.out.println(l.getIndex(3));
        l.printList();
    }
}
/* cannot use this class to store Strings ,
with this approach we have to create another class for
storing string array. */