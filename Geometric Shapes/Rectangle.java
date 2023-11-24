public class Rectangle extends GeometryObject{
    double a; double b;
    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public void setScale(double Scale) {
        scale = Scale;
        a = a * scale;
        b = b * scale;
    }

    @Override
    public double getSquare() {
        square = a*b;
        return square;
    }

    @Override
    public String toString() {
        return "Rectnagle{" +
                "a=" + a +
                ", b=" + b +
                ", square=" + square +
                ", scale=" + scale +
                '}';
    }
}
