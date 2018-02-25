/**
 * Test that running file for find the elapse time
 * @author Supaluk Jaroensuk
 */
public class FileTest {

    /**
     * Call any task for testing
     * @param fileName name of file
     */
    public void test(String fileName){
        TaskTimer taskTimer = new TaskTimer();
        Runnable runnable = new AppendStringTask(fileName);
        taskTimer.measureElapsed(runnable);

        Runnable runnable1 = new AppendStringBuilder(fileName);
        taskTimer.measureElapsed(runnable1);

        Runnable runnable2 = new AppendStringByBuffered(fileName);
        taskTimer.measureElapsed(runnable2);

    }
}
