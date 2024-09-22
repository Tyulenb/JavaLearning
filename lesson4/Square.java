package lesson4;

import java.awt.*;

public class Square extends Rectangle{

    public Square(int x, int y, Color color, Boolean isVisible, int a) {
        super(x, y, color, isVisible, a, a);
    }

    @Override
    void Draw(Graphics g) {
        super.Draw(g);
    }

    @Override
    double Square() {
        return super.Square();
    }

    @Override
    double Perimeter() {
        return super.Perimeter();
    }
}