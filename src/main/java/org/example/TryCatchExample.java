package org.example;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            String number = "one two one";
            Integer.parseInt(number);

        } catch(NumberFormatException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.err.println("it is not a number");

        }
    }
}
