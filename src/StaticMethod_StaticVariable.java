public class StaticMethod_StaticVariable
{
    public static void main(String[] args)
    {
        // static and non static variable
        Counter counter = new Counter();
        counter.counter();
        Counter counter1 = new Counter();
        counter1.counter();

        // static and non static method
        Rectangle.findValue(10,20);
        Rectangle.setI(10);
        System.out.println("Static Variable "+ Rectangle.getI());

    }
}

class Counter
{
    static int i = 10;
    void counter()
    {
        i++;
        System.out.println(i);
    }
}

class Rectangle
{

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        Rectangle.i = i;
    }

    static int i = 0;
    static void findValue(int l,int b)
    {
        System.out.println("Static Method "+ l*b);
    }
}
