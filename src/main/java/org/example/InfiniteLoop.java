package org.example;

public class InfiniteLoop {
    public static void main(String[] args) {
        for(int i= 0; i >=0 ; i++){ // Infinite Condition
            System.out.println("Iteration " + (0+i) );
        }

        for(; ; ){ // Infinite Condition
            System.out.println("Iteration "  );
        }
    }
}
