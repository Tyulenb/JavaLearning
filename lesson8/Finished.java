package lesson8;

public class Finished {
    private boolean finished = false;
    public synchronized void finish(){
        finished = true;
        notifyAll();
    }
    public synchronized boolean isFinished(){
        return finished;
    }
}
