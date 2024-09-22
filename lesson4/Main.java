package lesson4;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            Figure fg;
            Color color = Color.BLACK;
            int colId = rand.nextInt(3);
            switch (colId){
                case 0:
                   color = Color.ORANGE;
                   break;
                case 1:
                    color = Color.RED;
                    break;
                case 2:
                    color = Color.CYAN;
                    break;
            }
            int X = rand.nextInt(400);
            int Y = rand.nextInt(400);
            boolean isVisible = rand.nextBoolean();
            int fgId = rand.nextInt(3);
            switch (fgId){
                case 1:
                    fg = new Circle(X, Y, color, isVisible, rand.nextInt(200));
                    break;
                case 2:
                    fg = new Square(X, Y, color, isVisible, rand.nextInt(200));
                    break;
                default:
                    fg = new Rectangle(X, Y, color, isVisible, rand.nextInt(200), rand.nextInt(200));
                    break;
            }
            fg.Draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Geometric Figures");
        Main panel = new Main();
        frame.add(panel);

        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}