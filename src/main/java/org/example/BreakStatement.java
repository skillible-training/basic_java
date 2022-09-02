package org.example;

public class BreakStatement {
    public static void main(String[] args) {
        int i = 0;
        while(true){
            if (i > 5) {
                break;
            }
            System.out.println("value of i: " + i);
            i++;
        }
    }
}
