package org.example;

public class Parent {
    String variableInParent = "Parent variable";
    Parent() {
        System.out.println(" Parent class Constructor");
    }

    public void parentMethod() {
        System.out.println(" value of variable is " + variableInParent);
    }
}

class Child extends Parent{
    public Child() {
        super(); // Call the parent constructor by super
        super.variableInParent = "value from child"; // access variable using super
    }

    public void childMethod() {
        super.parentMethod(); // call the parent method using super
    }
}
