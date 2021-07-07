/*
First the constructor of base class is called
then the constructor of derived class is called

what if the constructor of our base class has a
parameter, there will be a compilation error
there is no default constructor available
in aUIControl . here we need to explicitly
call this constructor
*/
package com.company;

class aUIControl{// parent/Base/super class
    private boolean isEnabled=true;

//    public aUIControl(){
//        System.out.println("aUIControl: constructor of parent/Base/super class");
//    }

    public aUIControl(boolean isEnabled){
        System.out.println("aUIControl: constructor of parent/Base/super class");
        this.isEnabled=isEnabled;
    }

    public void enable(){
        isEnabled =true;
    }
    public void disable(){
        isEnabled=false;
    }
    public boolean isEnabled(){
        return isEnabled;
    }
}

class bTextBox extends aUIControl{// child/Derived/sub class
    private String text="";

    public bTextBox(){ // constructor
        super(true);// this statement should be the very first statement
        System.out.println("TextBox: constructor of child/Derived/sub class");
    }

    public  void setText(String text){
        this.text   =  text;
    }
    public void clear(){
        text="";
    }
    public void getText(){
        System.out.println(text);
    }
}


public class bn_ConstructorsAndInheritance {
    public static void main(String[] args) {
        var textBox1 = new bTextBox();

        /* OUTPUT -
         aUIControl: constructor of parent/Base/super class
         TextBox: constructor of child/Derived/sub class
        */

    }
}
