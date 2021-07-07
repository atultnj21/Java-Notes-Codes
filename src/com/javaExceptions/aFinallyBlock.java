/*
let's say we successfully open the file for reading
but something goes wrong when we tried to read data
from it
File handle are operating system resources whenever
we get them we should always release them
*/
package com.javaExceptions;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class aFinallyBlock {
    public static void main(String[] args) {
        show();
    }
    public static void show(){
        FileReader reader=null;
        try {
            reader = new FileReader("file.txt");
            reader.read();
        }catch (IOException e){
            System.out.println("could not read data");
        }
        finally {
            if(reader!=null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
