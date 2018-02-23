public class Stopwatch {

    private long startTime;
    private long stopTime;
    private boolean running;

    public Stopwatch(){
        this.running = false;
    }

    public void start(){
        this.startTime = System.nanoTime();
        this.running = true;
    }

    public void stop(){
        if(!running) return;
        this.stopTime = System.nanoTime();
        running = false;
    }

    public boolean isRunning(){
        return running;
    }

    public double getElapsed(){
        if(running) return (System.nanoTime() - startTime)*1.0E-9;
        else return (stopTime - startTime)*1.0E-9;
    }

}
