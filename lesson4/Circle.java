package lesson4;

import javax.swing.*;
import java.awt.*;

public class Circle extends Figure{
    private int radius;
    @Override
    void Draw(Graphics g) {
        g.setColor(color);
        if(!isVisible){
            g.drawOval(20,20, radius, radius);
        }else{
           g.fillOval(20,20,100,100);
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
