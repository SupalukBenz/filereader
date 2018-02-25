import java.io.FileReader;
import java.io.IOException;

/**
 * AppendStringBuilder class implements Runnable an interface
 * for implement run() method to read file by FileReader and return
 * the length's result
 * @author Supaluk Jaroensuk
 */
public class AppendStringTask implements Runnable {
    /**
     * The name's file
     */
    private int size;

    /**
     * The size of length's file, as a integer
     */
    private String filename;

    /**
     * Initialize the name of file and set size equals to zero
     * @param filename is name's file
     */
    public AppendStringTask(String filename){
        this.filename = filename;
        this.size = 0;
    }

    /**
     * Read file for find length of file
     */
    @Override
    public void run() {
        String data = "";
        FileReader reader = null;
        try {
            int n;
            reader = new FileReader(filename);
            while (( n = reader.read()) >= 0){
                data += (char)n;
            }
            if(reader != null) reader.close();
        }catch (IOException ex){
            // System.out.println( ex.getMessage() )  is more readabgle than stacktrace
            ex.printStackTrace();
        }
        this.size = data.length();
    }

    /**
     * Return result ,as a string
     * @return detail of file and size of file
     */
    public String toString(){
        return "Reading Alice-in-Wonderland-in-Wonderland.txt using FileReader, append to String. Read "+size+" char.";
    }
}
