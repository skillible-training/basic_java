package org.example;



public class ArrayExample {
    public static void main(String[] args) {
        // Create array with data
        String[] festivals = {"diwali", "rakhi", "janamashatmi", "holi", "eid"};

        // Create array and set data later.
        String[] nationalHolidays = new String[2];

        // Assign the value to the array
        nationalHolidays[0] = "Republic Day"; // first position, starts at 0th index
        nationalHolidays[1] = "Independence Day"; // second position, starts at 1st index
        nationalHolidays[nationalHolidays.length-1] = "Gandhi Jyanti"; // last position

        // Check the length
        int arrLength = festivals.length;

        System.out.println("arrLength = " + arrLength);
        System.out.println("2nd element: " + festivals[1]);

        printArray(nationalHolidays);
    }

    public static void printArray(String arr[]) {
        for(int i = 0; i<arr.length; i++) {
            System.out.println("position: " + i + " value: " + arr[i]);
        }

    }
}
