package org.example;

import java.util.Scanner;

public class InputSample {
    public static void main(String[] args)
    {
        // Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);

        // Get name from the user.
        System.out.print("Enter Name ");
        String name = console.next();

        // Get name from the user.
        System.out.print("Enter Name ");
        int age = console.nextInt();

        System.out.println("name: " + name +" age: " + age);
    }
}
