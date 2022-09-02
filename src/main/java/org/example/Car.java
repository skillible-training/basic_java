package org.example;

public abstract class Car {
    // Abstract Method
    public abstract void accelerate();
    public abstract void breaking();
}


class TataNexon extends Car {
    public TataNexon() {

    }
    String name = "Tata Nexon";
    public void accelerate() {
        System.out.println(name + " is accelerating.");
    }
    public void breaking() {
        System.out.println(name + " is breaking.");
    }
}

class AbstractClassDemo {
    public static void main(String[] args) {
        System.out.println("---Abstract Implementation in Java---");
        TataNexon myCar = new TataNexon();
        myCar.accelerate();
        myCar.breaking();

        Car car = new TataNexon();
    }
}