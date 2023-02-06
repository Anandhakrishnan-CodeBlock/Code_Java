package Polymorphism;

public class PolymorphismRun
{
    public static void main(String[] args)
    {
        Birds birds = new Birds();
        birds.sound();
        Kaka kaka = new Kaka();
        kaka.sound();
        Keli keli = new Keli();
        keli.sound();
        System.out.println("----------------");
        // UpCatching
        Birds birds1 = new Kaka();
        birds1.sound();
    }
}

class Birds {
    public void sound() {
        System.out.println("Polymorphism.Birds Sound");
    }
}

class Kaka extends Birds {
    public void sound() {
        System.out.println("Polymorphism.Kaka Sound");
    }
}

class Keli extends Birds {
    public void sound() {
        System.out.println("Polymorphism.Keke Sound");
    }
}

/**
 * Run time polymorphism is extending base class method to sub - class and overwrite the same function in sub class.
 * Other wide called as Overriding....
 */