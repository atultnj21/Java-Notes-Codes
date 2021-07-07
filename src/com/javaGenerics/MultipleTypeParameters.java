package com.javaGenerics;

class KeyValue<K,V>{
    private K key;
    private V value;

    public KeyValue(K key,V value){
        this.key=key;
        this.value=value;
    }
    public void printKeyValue(){
        System.out.println(key+ " = " + value);
    }
}
public class MultipleTypeParameters {
    public static void main(String[] args) {
        KeyValue k = new KeyValue("atul",21);

    }
}
