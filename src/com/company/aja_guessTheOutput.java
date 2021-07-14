package com.company;
/* with the Literal 010 it is specified that it is using Octal format since
its prefixed with 0(if there is no prefix 0, then it’s considered as decimal,
which is default numbering format used).
so convert 10 to octal format, you get 8
starting from right 0*(8 power of 0) + 1*(8 power of 1) which is equal to 8 */
public class aja_guessTheOutput {
    public static void main(String[] args) {
        int a =010;
        int b = 10;
        System.out.println(a);//8
        System.out.println(b);//10
    }
}
