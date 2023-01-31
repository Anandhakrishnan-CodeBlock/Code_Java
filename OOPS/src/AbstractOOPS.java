// Base abstract class
abstract class Animal{
    int abs = 0;
    public abstract void sound();
    public void sleep() {
        System.out.println("Zzz");
    }
}
// To use abstract. We need to inherit the abstract class

class Pig extends Animal{
    @Override
    public void sound() {
        System.out.println("The pig says: Wee Wee...");
    }

    public void sleep() {
        System.out.println("Zzz Zzz....");
    }
}

public class AbstractOOPS {
    public static void main(String[] args) {

        Pig pig = new Pig();
        pig.sound();
        pig.sleep();
    }
}

/**
 abstract  can hold both abstract and non abstract methods
 we need to inherit abstract class to use and override the methods
 abstract not have method body {} empty
 */
