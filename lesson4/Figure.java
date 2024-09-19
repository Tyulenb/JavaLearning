package lesson4;

import javax.swing.*;
import java.awt.*;

public abstract class Figure extends JPanel {
    Color color;
    Boolean isVisible;
    abstract void Draw(Graphics g);
    abstract double Square();
    abstract double Perimeter();

}
