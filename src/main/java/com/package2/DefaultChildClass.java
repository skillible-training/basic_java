package com.package2; //Another Package

import com.package1.DefaultClass;

public class DefaultChildClass extends DefaultClass{ // Extending the DefaultClass
    public static void main(String[] args) {
        DefaultChildClass defaultChildClass = new DefaultChildClass();
        defaultChildClass.defaultMethod(); // Even extending it gives error as it cannot access that private method
    }
}

