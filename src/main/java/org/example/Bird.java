package org.example;

// Parent class which have the sound method
public class Bird {
    public void sound () {
        System.out.println("sound");
    }
    public void sound (int times) {
        System.out.println("sound");
    }

}

// this is the child class of the Bird
// and it has same method called sound
class Pigeon extends Bird {
    public void sound () {
        System.out.println( "cooing sound" ) ;
    }
    public void newBehaviour() {
        System.out.println( "New Behaviour" ) ;
    }
}

// Demo class to run the static polymorphism
class DemoClass{
    public static void sound() {
        System.out.println( "default sound" ) ;
    }
    public static void sound(String birdName) {
        System.out.println( "Sound of this bird: " + birdName ) ;
    }
    public static void sound(String birdName, int printTimes) {
        for (int i = 0; i < printTimes; i++) {
            System.out.println((i+1) + ". Sound of this bird: " + birdName ) ;
        }
        System.out.println( "Sound of this bird: " + birdName ) ;
    }
    public static void main(String[] args) {
        System.out.println("---Static Polymorphism in Java---");
        Pigeon bird = new Pigeon();
        bird.sound();
        bird.newBehaviour();

    }
}

