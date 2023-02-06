abstract class ShapeAbstract {
    abstract void draw();

    String drawShape(String shape)
    {
        System.out.println(shape + "in abstract class");
        return shape;
    }
}
