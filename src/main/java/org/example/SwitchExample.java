package org.example;

public class SwitchExample {
    public static void main(String[] args) {
        int number = 32;
        String size;

        switch (number) {
            case 28:
                size = "small";
                break;
            case 32:
                size = "medium";
                break;
            case 34:
                size = "large";
                break;
            default:
                size = "unknown";
        }

        System.out.println("Indian size is: " + size);



    }
}


