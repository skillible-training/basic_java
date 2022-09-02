package org.example;

public class StaticMethodSample {
    static String className = "static method";
    String nonStaticVar = "some val";

    public static void setClassname(String newClzName) {
        className = newClzName;
    }

    public static String getClassName() {
        return className;
    }

    public void setNonStaticVar(String nonStaticVar) {
        this.nonStaticVar = nonStaticVar;
    }

    public String getNonStaticVar() {
        return this.nonStaticVar;
    }

}

class DemoStatic {
    public static void main(String[] args) {
        StaticMethodSample.setClassname("static method sample");
        StaticMethodSample sms1 = new StaticMethodSample();
        sms1.setNonStaticVar("first obj");
        StaticMethodSample sms2 = new StaticMethodSample();
        sms2.setNonStaticVar("second obj");

        System.out.println("sms1 obj data '"+sms1.getClassName()+ "' " + sms1.getNonStaticVar());
        System.out.println("sms2 obj data '"+sms2.getClassName()+ "' " + sms2.getNonStaticVar());
    }
}
