
public class Main {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10, 10);
		System.out.println(r.getSquare());
		Triangle t = new Triangle(3,4,5);
		System.out.println(t.getSquare());
		Circle c = new Circle(5);
		System.out.println(c.getSquare());
	}
}
