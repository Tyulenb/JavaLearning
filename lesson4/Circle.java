package lesson4;

import javax.swing.*;
import java.awt.*;

public class Circle extends Figure{
    private int radius;

    public Circle(int x, int y,Color color, Boolean isVisible,int radius) {
        this.coordX = x;
        this.coordY = y;
        this.color = color;
        this.isVisible = isVisible;
        this.radius = radius;
    }

    @Override
    void Draw(Graphics g) {
        g.setColor(color);
        if(!isVisible){
            g.drawOval(coordX,coordY, radius, radius);
        }else{
            g.fillOval(coordX,coordY,100,100);
        }

    }

    @Override
    double Square() {
        return 3.14*radius*radius;
    }

    @Override
    double Perimeter() {
        return 2*3.14*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}