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

class Birds
{
    public void sound()
    {
        System.out.println("Birds Sound");
    }
}
class Kaka extends Birds
{
    public void sound()
    {
        System.out.println("Kaka Sound");
    }
}
class Keli extends Birds
{
    public void sound()
    {
        System.out.println("Keke Sound");
    }
}
