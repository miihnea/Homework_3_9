public class Rectangle implements Shape {
    private float width;
    private float length;

    public Rectangle(float width, float length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }
}
