package org.example;

public class ContinueStatement {
    public static void main(String[] args) {
        for(int i=0; i< 8; i++) {
            if (i == 2 || i == 5 || i == 7){
                continue;
            }
            System.out.println("number is " + i);

        }
    }
}
