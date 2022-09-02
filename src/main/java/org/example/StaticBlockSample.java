package org.example;

public class StaticBlockSample {
    static int i = 50; // static variable
    static int j;      // static variable

    // Static block
    static {
        System.out.println("Inside Static Block");
        j = i + 10;
    }

    public static void main(String[] args) {
        System.out.println("---Inside main method---");
        System.out.println("i: " + i);
        System.out.println("j: " + j);
    }
}
