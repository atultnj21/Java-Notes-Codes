package com.javaExceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class aExceptionDemo {
    public static void show(){
        try{
            FileReader reader = new FileReader("file.txt");
            System.out.println("File Opened");
        } catch(FileNotFoundException ex){
            System.out.println("File does not exist");
            System.out.println(ex);
            System.out.println(ex.getMessage());
        }
    }
}
        /*
        OUTPUT:
        File does not exist
        java.io.FileNotFoundException: file.txt (The system cannot find the file specified)
        file.txt (The system cannot find the file specified)
        */