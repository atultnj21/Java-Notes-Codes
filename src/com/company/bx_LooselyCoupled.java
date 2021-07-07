/* ex:-2
Constructor injection */

package com.company;

interface Show {
    public void display();
}

class bB implements Show {
    public bB(){}
    public void display() {
        System.out.println("B");
    }
}

class C implements Show {
    public C(){}
    public void display() {
        System.out.println("C");
    }
}

class aA {
    Show s;
    public aA(Show s) {
        //s is loosely coupled to A
        this.s = s;
    }

    public void display() {
        System.out.println("A");
        s.display();
    }

}
public class bx_LooselyCoupled {
    public static void main(String[] args) {
        Show b = new bB();
        Show c = new C();

        aA a = new aA(b);
        //a.display() will print A and B
        a.display();

        aA a1 = new aA(c);
        //a.display() will print A and C
        a1.display();

        /* OUTPUT:
        Output
        A
        B
        A
        C
        */

    }
}
