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

