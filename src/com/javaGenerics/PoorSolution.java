/* one way to solve the problem we had in "aNeedForGenerics.java"
   is we can have an array of objects here , because the object
   class is the parent or base class of all reference types
   in java . */
package com.javaGenerics;

class aList{
    private int count;
    private Object[] items ;

    public aList(int cap){
        this.items = new Object[cap];
    }
    public void add(Object item){
        items[count++]=item;
    }

    public Object getIndex(int index){
        return items[index];
    }

    public void printList(){
        System.out.println("Printing List..");
        for(Object element: items){
            System.out.println(element);
        }
    }
}

public class PoorSolution {
    public static void main(String[] args) {
        aList list = new aList(10);
        list.add(10);
        list.add("hello");

        int number=(int)list.getIndex(0);
        String str = (String)list.getIndex(1);
        System.out.println(number);
        System.out.println(str);
    }
}
/*
object class is the parent or base class of all reference types
so we can store any objects in this list, however integer is a
primitive value . when we compile ,the java compiler changes
list.add(10); to list.add(Integer.valueOf(1)); and it is a
reference type

the problem in this code is if we use the wrong type
for typeCaasting we will get an invalidCastException
*/