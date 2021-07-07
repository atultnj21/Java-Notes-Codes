/* In java we should add each class in separate file
This helps us to organise our code in a better way */

/* if we don't initialize a reference type it is
by-default set to null */

package com.company;

import java.util.Locale;

class TextBox{
    public String text;// Feild

    public  void setText(String text){// Method

        /* In situations Where the name of the parameter
        is exactly the same as the name of the feild
        we can use the this keyword
        text field     text parameter*/
        this.text   =  text;
    }

    public void clear(){
        text="";
    }
}


public class bb_CreatingClass {
    public static void main(String[] args) {

        //creating objects
        TextBox textBox1 = new TextBox();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase());//BOX 1

        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text);//Box 2
    }
}
