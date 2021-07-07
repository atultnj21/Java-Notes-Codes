package com.javaGenerics;
class MyGeneric<T1,T2>{
    private T1 t1;
    private T2 t2;

    public T1 getT1() {
        return t1;
    }
    public void setT1(T1 t1) {
        this.t1 = t1;
    }
    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

}
public class cwhGenerics1 {
    public static void main(String[] args) {
        MyGeneric<Integer,String> g1= new MyGeneric();
        g1.setT1(21);
        int a = g1.getT1();
        g1.setT2("Hello");
//        int str =g1.getT2();
        String str=g1.getT2();
    }
}
