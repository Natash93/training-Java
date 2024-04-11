package org.example.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

class App {

    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("qwerty");
            throw new MyException();
        } catch (MyException e) {
            System.out.println("Error: " + e);
        } catch (FileNotFoundException e) {
            System.out.println(" File error: " + e);
        }
    }

}