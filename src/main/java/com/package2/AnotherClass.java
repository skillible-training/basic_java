package com.package2; // Another package

import com.package1.DefaultClass;

class AnotherClass {
    public void someMethod() {
        DefaultClass defaultClass = new DefaultClass();
        defaultClass.defaultMethod(); // Now it will not give any error as method is public
    }
}
