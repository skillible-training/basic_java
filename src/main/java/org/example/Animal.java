package org.example;

// Animal interface
public interface Animal {
    void sound();
}

// Animal interface implement by the Cat
class Cat implements Animal {
    public void sound() {
        System.out.println(" sound of cat is meow.");
    }

    public static void main(String[] args) {
        System.out.println("---Interface Implementation in Java---");
        Animal cat = new Cat();
        cat.sound();
    }
}
