package lesson4;

import java.awt.*;

public class Rectangle extends Figure{
    private int a, b;
    @Override
    void Draw(Graphics g) {
        g.setColor(color);
        if(!isVisible){
            g.drawRect(10,10,a,b);
        }else {
            g.fillRect(10,10,a,b);
        }
    }

    @Override
    double Square() {
        return a*b;
    }

    @Override
    double Perimeter() {
        return (a+b)*2;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
