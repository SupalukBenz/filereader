/**
 * Initialize file name for any task
 * @author Supaluk Jaroensuk
 */
public class Main {

    /**
     * Name of file for reading
     */
    private final static String fileName = "src/Alice-in-Wonderland.txt";

    /**
     * Starting program
     * @param args not used
     */
    public static void main(String[] args) {
       FileTest fileTest = new FileTest();
       fileTest.test(fileName);
    }

}
