package com.package1;

public abstract class AbstractSample {

    public abstract void aAbstractMethod();

    final public void fullMethod() {
        System.out.println("This is fully implemented method");
    }
}

class AbstractImplementation extends AbstractSample {

    final String name = "helloWorld";

    public void aAbstractMethod() {

        System.out.println("This is implemented in the child class");
    }


}


