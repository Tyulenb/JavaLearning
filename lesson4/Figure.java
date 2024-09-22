package lesson4;

import javax.swing.*;
import java.awt.*;

public abstract class Figure extends JPanel {
    Color color;
    Boolean isVisible;
    int coordX;
    int coordY;

    abstract void Draw(Graphics g);
    abstract double Square();
    abstract double Perimeter();

}