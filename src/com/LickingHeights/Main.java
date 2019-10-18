package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    System.out.println("Hello World");
    Scanner keyboard;
    keyboard = new Scanner (System.in);


        System.out.println("What is your name?");
        String greeting;
        String name;
        name = " ";
        name = keyboard.nextLine();
        System.out.println( "Hello " + name);

        int number1;
        int number2;
        System.out.println("Give a number.");
        number1 = keyboard.nextLine();
        System.out.println("Give me a second number.");
        number2 = keyboard.nextLine();

    }
}
