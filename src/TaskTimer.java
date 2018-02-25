/**
 * TaskTimer class that compute and print the time for any task
 * @author Supaluk Jaroensuk
 */
public class TaskTimer{

    /**
     * Run the any task ,measure the elapse time and print result to console
     * @param runnable is interface of any task
     */
    public void measureElapsed(Runnable runnable){

        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        runnable.run();
        stopwatch.stop();
        System.out.println(runnable.toString());
        System.out.printf("Read in %.4f sec.%n" ,  stopwatch.getElapsed());

    }

}
