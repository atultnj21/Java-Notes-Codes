/* Switch Statement */
package com.company;
public class ao_SwitchStatement {
    public static void main(String[] args) {
/*
we use switch statements to execute different parts
of code, depending on the value of an expression.
Kind of similar to if statements.

we're going to write a program and check the role of
the current user. And then we're going to suggest or
give them different features depending on their role

we need to add a break statement to jump out of
this switch block
optionally we can have a default clause here, so if
none of these previous cases apply, the code that
we write in this section will be executed.
here we don't need to use a break statement
*/
        String yourRole="Moderator";
        switch (yourRole){
            case "Admin":
                System.out.println("you're Admin");
                break;

            case "Moderator":
                System.out.println("you're Moderator");
                break;

            default:
                System.out.println("you're guest");
        }

/* Using if-statement */
        String role = "Admin";
        if(role=="Admin")
            System.out.println("you're Admin");
        else if(role=="Moderator")
            System.out.println("you're Moderator");
        else
            System.out.println("you're guest");
    }
}
