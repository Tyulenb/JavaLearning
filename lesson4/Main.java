package lesson4;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Circle cr = new Circle();
        cr.color = Color.BLUE;
        cr.isVisible = true;
        cr.setRadius(1000);

        Rectangle rc = new Rectangle();
        rc.color = Color.GREEN;
        rc.isVisible = true;
        rc.setA(100);
        rc.setB(100);

        JFrame fr = new JFrame();
        fr.setBounds(10,10,500,500);
        fr.setDefaultCloseOperation(3);
        JPanel pn = new JPanel(){
            @Override
            public void paint(Graphics g){
                cr.Draw(g);
                rc.Draw(g);
            }
        };
        fr.add(pn);
        fr.setVisible(true);
    }
}
