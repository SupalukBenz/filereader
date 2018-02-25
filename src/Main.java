/**
 * Initialize file name for any task
 * @author Supaluk Jaroensuk
 */
public class Main {

    /**
     * Name of file for reading
     */
    private final static String fileName = "src/Alice-in-Wonderland-in-Wonderland.txt";

    /**
     * Starting program
     * @param args not used
     */
    public static void main(String[] args) {
        TaskTimer taskTimer = new TaskTimer();
        Runnable runnable = new AppendStringTask(fileName);
        taskTimer.measureElapsed(runnable);

        Runnable runnable1 = new AppendStringBuilder(fileName);
        taskTimer.measureElapsed(runnable1);

        Runnable runnable2 = new AppendStringByBuffered(fileName);
        taskTimer.measureElapsed(runnable2);
    }

}
