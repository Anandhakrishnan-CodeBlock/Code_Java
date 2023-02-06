public class SampleClass extends ShapeAbstract {

    private int  num = 1; // Encapsulation hiding data from other(private)
    private boolean state = true;// Encapsulation hiding data from other(private)
    private float decimal = 1.0F;// Encapsulation hiding data from other(private)

    void display() // global method to access Encapsulation variables
    {
        System.out.println(num);
        System.out.println(state);
        System.out.println(decimal);
    }

    @Override
    void draw() {
        System.out.println("Abstract Method in Sample Class");
    }
}
