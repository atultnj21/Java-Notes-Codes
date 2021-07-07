/* Inheritance :
   The third principle of OOP
   Inheritance is an important pillar of
   OOP(Object-Oriented Programming). It is
   the mechanism in java by which one class
   is allowed to inherit the features(fields
   and methods) of another class. ... The subclass
   can add its own fields and methods in addition
   to the superclass fields and methods. */

package com.company;

class UIControl{// parent/Base/super class
    private boolean isEnabled=true;
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

class aTextBox extends UIControl{// child/Derived/sub class
    private String text;

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

public class bl_Inheritance {
    public static void main(String[] args) {
        var control= new aTextBox();
        control.setText("Atul");
        control.getText();//Atul
        control.disable();
        System.out.println(control.isEnabled());//false
    }
}
