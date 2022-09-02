package org.example.lamda.func;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamExample {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        IntStream stream = Arrays.stream(nums);
        for(int i=0; i< nums.length ; i++) {
            int num = nums[i];
            System.out.println(num);
        }
        // print all the number
        stream.forEach(num -> {

            System.out.println(num);
        });


        List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 5, 7));
        list.stream().map(i -> {
            return i*i;
        }).forEach(tmp -> {
            System.out.println("square value is: " + tmp);
        });
    }
}
