package lesson8;

public class Xcoordinate implements Runnable {
    private double x = 0;
    private double movingPower;
    private final Finished sync;
    private double height;

    public Xcoordinate(double movingPower, double height, Finished sync) {
        this.movingPower = movingPower;
        this.sync = sync;
        this.height = height;
    }

    @Override
    public void run() {
        int time = 0;
        while (!sync.isFinished()){
           synchronized (sync) {
               x = movingPower * time * time / 2;
               System.out.println("X = " + x);
               time++;
               sync.notify();
               try{
                   sync.wait();
                   Thread.sleep(480);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        }
        System.out.println("Пройденное расстояние за " + (time-1) + " полных секунд = " + Math.sqrt(height*height+x*x));
    }
}
