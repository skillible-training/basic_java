package org.example;

/**
 * Here can put the comment on the class what is the use of this class.
 */
public class CommentExample {
    // This is single line comment for the variable.
    String name = "default name";

    /**
     * This is the area of the doc string where mentioned the method detail.
     * @param greet Greet you want
     * @return return the modified greet
     */
    public String myMethod(String greet){
        /*
        this is the sample of other way to write the comments where you multiple lines of commenting like in this.
        1. here is some detail
        2. what is the algo of this.
         */
        return greet + name;
    }
}
