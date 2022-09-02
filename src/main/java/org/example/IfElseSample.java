package org.example;

public class IfElseSample {
    public static void simpleCondition() {
        String month = "June";
        if (month.equals("January")) { // if condition only work for january
            System.out.println("Happy new year");
        }

        int dayOfWeek = 5;
        if (dayOfWeek <= 5) { // if condition, if this fail goes to else condition
            System.out.println("Good Morning");
        }
        else { // else block execute if block is not execute.
            System.out.println("Happy Weekend");
        }

        int dayOfMonth = 31;
        if(dayOfMonth == 1) { // if condition check
            System.out.println("Salary Day");
        } else if (dayOfMonth == 31) { // if first condition fail then this execute
            System.out.println("Hmm Extra Day to work");
        } else { // all if block not execute then this will execute.
            System.out.println("Waiting for Salary Day :)");
        }


    }

    public static void nestedCondition() {
        String month = "January";
        int dayOfMonth = 27;
        if (month.equals("January")) { // if condition only work for January
            if(dayOfMonth == 26) {
                System.out.println("Happy Republic Day");
            } else {
                System.out.println("Happy new year");
            }

        }
    }

    public static void multipleCondition() {
        String month = "May";
        int dayOfMonth = 26;
        if (month.equals("January") && dayOfMonth == 26) { // if condition only work for 26 January
            System.out.println("Happy Republic Day");
        }
        else if (month.equals("April") || month.equals("May")) { // condition work either April or May
            System.out.println("Happy Summer days");
        }
        else {
            System.out.println("Good Day to you");
        }
    }


    public static void main(String[] args) {
        multipleCondition();
    }
}
