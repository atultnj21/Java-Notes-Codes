/*
 Checked exceptions forces programmers to deal with
 the exception that may be thrown

 IOException,SQLException,illegalThreadStateException,etc are
 checked exceptions

 "Checked" Means they will bw checked at compile time itself
*/
package com.javaExceptions;

import java.io.IOException;

public class ThrowsCheckedException{
    public static void main(String[] args) throws IOException{
        throw new IOException();
    }
}
