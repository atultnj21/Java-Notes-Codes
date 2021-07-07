/* We can declare generic methods inside non-Generic class . */

package com.javaGenerics;
class Utils{

    public static <T extends Comparable<T>> T max(T first, T second){
        return (first.compareTo(second)<0) ? second:first;
    }
//Multiple type parameter
    public static <K,V> void print(K key, V value){
        System.out.println(key + " = " +value);
    }

}
public class GenericMethods {
    public static void main(String[] args) {
        System.out.println(Utils.max(5,4));//5
        Utils.print("atul",21);
    }
}
