package Polymorphism;

class Add
{
    int add(int a,int b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return  a+b+c;
    }
    int add(int a,int b,int c,int d)
    {
        return  a+b+c+d;
    }
}
public class PolymorphismCompile
{
    public static void main(String[] args)
    {
        // Compile time polymorphism
        Add poli = new Add();
        System.out.println(poli.add(1,2));
        System.out.println(poli.add(1,2,3));
        System.out.println(poli.add(1,2,3,4));
    }

}

/**
 Compile time polymorphism is method having a same but different forms (different parameter).
 Based on the method type corresponding method called.
 Other wide called as Overloading....
 */

