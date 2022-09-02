package org.example;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        List aList = new ArrayList();
        aList.add("hello");
        Car car = new TataNexon();
        aList.add(car);
        aList.add(new Integer(456));


        Car myCar1 = (Car) aList.get(1);
        Car myCar2 = (Car) aList.get(2);

        Object myCar3 = aList.get(1); // Need to cast for use.
    }
}


