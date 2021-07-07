/* https://docs.oracle.com/javase/8/docs/api/java/lang/Number.html */
package com.javaGenerics;
//This constraint can be an interface too
class aGenericList<T extends Number>{
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
public class ConstraintsInGenericList {
    public static void main(String[] args) {
        //aGenericList<String> list = new aGenericList<>();

        //Type parameter 'java.lang.String' is not within its
        // bound; should extend 'java.lang.Number'

        aGenericList<Float> list= new aGenericList<>();

    }
}
