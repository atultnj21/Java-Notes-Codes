/* We want this class to be generic so that we can store
  different type of objects this T represents type of objects
   we wanna store in this list
   When we create an instance of this class we'll have to
   specify an argument or a value for this parameter */

package com.javaGenerics;

class GenList<T>{
    //Now we need an array of type T
    //private T[] items = new T[10];
    // Here we have a compilation error because java compiler doesn't know about T at this stage

    private T[] items = (T[])new Object[10];
    private int count;

    public void add(T item){
        items[count++]=item;
    }

    public T getIndex(int index){
        return items[index];
    }

    public void printList(){
        System.out.println("Printing List..");
        for(T element: items){
            System.out.println(element);
        }
    }

}

public class GenericList{
    public static void main(String[] args) {
        var n = new GenList<Integer>();
        // n.add("Hello"); this gives compile time error
        n.add(1);
        n.add(2);
        n.add(3);
        int number=n.getIndex(0);
        System.out.println(number);
        n.printList();
    }
}
