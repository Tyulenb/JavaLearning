public class Circle extends GeometryObject {
    double r;
    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getSquare() {
        square = r*r*3.14;
        return square;
    }

    @Override
    public void setScale(double Scale) {
        scale = Scale;
        r=r*scale;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", square=" + square +
                ", scale=" + scale +
                '}';
    }
}
