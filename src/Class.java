public class Class extends TestClass
{
    public static void main(String[] args)
    {
        // Object creation and memory allocation
        SampleClass sampleClass = new SampleClass();
        // Object instantiation
        sampleClass.display();
        // access abstract method
        sampleClass.draw();
        // access abstract method defined in abstract class
        System.out.println(sampleClass.drawShape("Rectangle Shape"));
        // self defined abstract object
        ShapeAbstract shapeAbstract = new ShapeAbstract() {
            @Override
            void draw() {
                System.out.println("sample");
            }
        };
        shapeAbstract.draw();

        ShapeAbstract shapeAbstract1 = new SampleClass();
        shapeAbstract1.draw();

        ShapeAbstract shapeAbstract2 = new TestClass();
        shapeAbstract2.draw();

        TestClass testClass = new TestClass();
        testClass.draw();
    }
}

