public class TaskTimer{

    public void measureElapsed(Runnable runnable){
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        runnable.run();
        stopwatch.stop();
        System.out.println(runnable.toString());
        System.out.printf("Read in %.4f sec.%n" ,  stopwatch.getElapsed());

    }

}
