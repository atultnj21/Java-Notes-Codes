/*
Try statement can have one or more resources
with this statement we dont need to explicitly
close this resource inside a final block
*/
package com.javaExceptions;

import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        show();
    }

    public static void show() {
        try (FileReader reader = new FileReader("file.txt")){
            reader.read();
        } catch (IOException e) {
            System.out.println("could not read data");
        }
    }
}