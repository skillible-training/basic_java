package org.example;

public class WhileLoopSample {

    public static void main(String[] args) {
        int i = 0;
        while(i <= 10 ){
            System.out.println("Iteration " + (0+i) );
            i += 2;
        }
    }
}

 class WhileInfiniteLoopSample {

    public static void main(String[] args) {
        int i = 0;
        while(true){ // infinite condition
            System.out.println("Iteration " + (0+i) );
            i += 2;
        }
    }
}

 class WhileWithBreakSample {

    public static void main(String[] args) {
        int i = 0;
        while(true){ // infinite condition
            System.out.println("Iteration " + (0+i) );
            i += 2;
            if (i>30) {
                break;
            }
        }
    }
}

