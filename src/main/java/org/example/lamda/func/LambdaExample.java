package org.example.lamda.func;

public class LambdaExample {
    public static void main(String[] args) {
        ZeroParamFuncInterface zpfi = () -> System.out.println("Hello zero lambda");
        zpfi.zeroParamFunc();

        OneParamFuncInterface opfi = (num) -> num*num*num;
        int num = 8;
        System.out.println("cube of " + num + " is " + opfi.cube(num));

        MultiParamFuncInterface mpfi = (firstName, lastName) -> {
            StringBuilder sb = new StringBuilder();
            sb.append(firstName).append(" ").append(lastName);
            return sb.toString();
        };
        System.out.println("full name is " + mpfi.multiParamFunc("Hira", "Nandani"));
    }
}
