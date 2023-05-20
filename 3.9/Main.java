public class Main {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        MultipleAreas multipleAreas = new MultipleAreas();

        Shape shape1 = shapeMaker.getShape(new Circle(1));
        Shape shape2 = shapeMaker.getShape(new Rectangle(1,2));
        Shape shape3 = shapeMaker.getShape(new Square(2));

        multipleAreas.addShape(shape1);
        multipleAreas.addShape(shape2);
        multipleAreas.addShape(shape3);

        multipleAreas.computeAreas();



    }
}
