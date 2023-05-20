public class Square implements Shape{
    private float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }
}
