package org.example;

// Parent Interface called one
public interface One {
    void methodOne();
}

// This is the child interface of parent interface called One
interface TwoOne extends One {
    void methodTwoOne();
}

// This is  also  child interface of parent interface called One
interface TwoTwo extends One {
    void methodTwoTwo();
}

// This is the child class of both TwoOne and TwoTwo interface
// and it implements the method of all the interfaces.
class Three implements TwoOne, TwoTwo {

    @Override
    public void methodOne() {
        System.out.println("my name is methodOne");
    }

    @Override
    public void methodTwoOne() {
        System.out.println("my name is methodTwo");
    }

    @Override
    public void methodTwoTwo() {
        System.out.println("my name is methodThree");
    }
}