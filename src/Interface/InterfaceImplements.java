package Interface;

class Display implements Interface, MultipleInterfaces
{
    @Override
    public void print() {
        System.out.println("Normal interface method..");
    }
}
public class InterfaceImplements {
    public static void main(String[] args) {
       Display display = new Display();
       // override method
       display.print();
       // default method
       display.newPrint();
    }
}
/**
 * method having no body (except default)
 * interface help to define a structured approach for a class
 * multiple interface is possible in java
 * default help to create additional function with body for feature update
 */