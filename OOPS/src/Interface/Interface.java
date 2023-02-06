package Interface;

public interface Interface {
    void print();
    default void newPrint()
    {
        System.out.println("Default interface method....");
    }
}
