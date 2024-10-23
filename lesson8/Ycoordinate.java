package lesson8;

public class Ycoordinate implements Runnable{
    private double y = 0;
    private double liftingPower;
    private double resPower;
    private final Finished sync;

    public Ycoordinate(Finished sync, double resPower, double liftingPower, double height) {
        this.sync = sync;
        this.resPower = resPower;
        this.liftingPower = liftingPower;
        this.y = height;
    }

    @Override
    public void run() {
        int time = 0;
        double g = 10 - liftingPower - resPower;
        double height = 0;
        while (true){
            synchronized (sync){
                height = g*time*time/2;

                if(y-height<0){
                    System.out.println("Y = 0");
                    sync.finish();
                    return;
                }
                System.out.println("Y = " + (y-height));

                time++;
                sync.notify();
                try {
                   sync.wait();
                   Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
