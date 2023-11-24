public class Triangle extends GeometryObject{
    double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getSquare() {
        double p = (a+b+c)/2;
        square = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return square;
    }

    @Override
    public void setScale(double Scale) {
    	a=a*scale; 
    	b=b*scale; 
    	c=c*scale;
        scale = Scale;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", square=" + square +
                ", scale=" + scale +
                '}';
    }
}
