package org.example;

import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {
        String one = "abc";
        String two = "abc";
        String three = new String("abc");
        char[] charArr = {'a', 'b', 'c'};
        String four = new String(charArr);

        System.out.println("is one or two is same object : " + (one == two) );
        System.out.println("is one or three is same object : " + (one == three) );
        System.out.println("char array to String: " + four);
        System.out.println("Comparing the string value: " + one.equals(three));

    }
}
