public class Inheritance {
    public static void main(String[] args) {
        son son = new son();
        son.name();
        father father = new father();
        father.name();
        grantFather grantFather = new grantFather();
        grantFather.name();
    }
}
class grantFather
{
    void name()
    {
        System.out.println("GrantFather");
    }
}
class father extends grantFather
{
    void name()
    {
        System.out.println("Father");
    }
}
class son extends father
{
    void name()
    {
        System.out.println("Son");
    }
}
