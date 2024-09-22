package lesson4;

import java.awt.*;

public class Rectangle extends Figure{
    protected int a, b;

    public Rectangle(int x, int y, Color color, Boolean isVisible, int a, int b){
        this.coordX = x;
        this.coordY = y;
        this.color = color;
        this.isVisible = isVisible;
        this.a = a;
        this.b = b;
    }

    @Override
    void Draw(Graphics g) {
        g.setColor(color);
        if(!isVisible){
            g.drawRect(coordX,coordY,a,b);
        }else {
            g.fillRect(coordX,coordY,a,b);
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