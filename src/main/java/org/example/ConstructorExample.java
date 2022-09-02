package org.example;

public class ConstructorExample {
    String someVar = "not initialized";

    public ConstructorExample() {
        this("use this"); // Invoke the Constructor using 'this'
        System.out.println(" Called Default Constructor");
    }

    public ConstructorExample(String initVarValue) {
        this.someVar = initVarValue; // refer to the current instance variable
        System.out.println(" Called parameterized Constructor");
    }

    public ConstructorExample getInstance() {
        return this; // Return the current instance
    }

    public String display(ConstructorExample eg) {
        return eg.someVar;
    }
    public String displayOne() {
        // invoking the method using this.
        return this.display(this); // here passing the current object
    }

    public static void main(String[] args) {
        // Call the zero args Constructor
        ConstructorExample eg = new ConstructorExample();



    }
}
