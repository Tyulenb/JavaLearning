package lesson8;

import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {
        //Масса в данном эскперименте равна 1
        Scanner in = new Scanner(System.in);

        System.out.println("Симуляция падения тела, введите необходимые параметры симуляции: ");
        System.out.println("Высота: ");
        double height = in.nextDouble();
        System.out.println("Подъемная сила, рекомендумое значение < 8 Н: ");
        double liftPower = in.nextDouble();
        System.out.println("Движущая сила: ");
        double movingPower = in.nextDouble();
        System.out.println("Сила сопротивления среды, рекомендуемое значение < 2: ");
        double resPower = in.nextDouble();

        Finished fin = new Finished();
        Thread Y = new Thread(new Ycoordinate(fin, resPower, liftPower, height));
        Thread X = new Thread(new Xcoordinate(movingPower, height, fin));

        X.start();
        Y.start();

        try {
            X.join();
            Y.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Both threads have finished.");
    }
}
