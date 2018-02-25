/**
 * Stopwatch class for running time
 * @author Supaluk Jaroensuk
 */
public class Stopwatch {

    /**
     * Starting time ,as a long
     */
    private long startTime;

    /**
     * Stopping time ,as a long
     */
    private long stopTime;

    /**
     * Checking that time is running or not
     */
    private boolean running;

    /**
     * Initialize running is false
     */
    public Stopwatch(){
        this.running = false;
    }

    /**
     * Start time if stopwatch is not running and reset the stopwatch
     */
    public void start(){
        this.startTime = System.nanoTime();
        this.running = true;
    }

    /**
     * Stop time if stopwatch is already stopped
     */
    public void stop(){
        if(!running) return;
        this.stopTime = System.nanoTime();
        running = false;
    }

    /**
     * Check that stopwatch is running or not
     * @return true if stopwatch is running and false if stopwatch isn't running
     */
    public boolean isRunning(){
        return running;
    }

    /**
     * If stopwatch is stopped, then return the time between calling start and stop and
     * if stopwatch is running, then return the time between calling start and current time
     * It's return the time ,as a seconds
     * @return time between calling start and current time
     */
    public double getElapsed(){
        if(running) return (System.nanoTime() - startTime)*1.0E-9;
        else return (stopTime - startTime)*1.0E-9;
    }

}
