package org.example;

public class MultiDimensionArraySample {
    public static int[][] getArray() {
        int[][] intArr = {{1,2,3}, {6,7,8}};
        
        return intArr;
    }

    public static void main(String[] args) {
        int[][] myArr = getArray();
        System.out.println("1st element of 2nd row: " + myArr[1][0]);
        System.out.println("3rd element of 1st row: " + myArr[0][2]);

        getJaggedArray();

    }


    public static void getJaggedArray() {
        // Declare the array
        String[][] strArray = new String[2][];

        // Define the size of each row.
        strArray[0] = new String[5];
        strArray[1] = new String[3];

        strArray[0][0] = "first row, first element";
        strArray[1][0] = "second row, first element";
        strArray[1][1] = "second row, second element";

        for (int i=0; i < strArray.length; i++){
            System.out.println("Row index: " + i);
            for (int j=0; j<strArray[i].length; j++) {
                System.out.println("---- Column data is " + strArray[i][j]);
            }
        }

    }
}
