import java.io.FileReader;
import java.io.IOException;

/**
 * AppendStringBuilder class implements Runnable an interface
 * for implement run() method to read file by FileReader and return
 * the length's result
 * @author Supaluk Jaroensuk
 */
public class AppendStringBuilder implements Runnable{
    /**
     * The name's file
     */
    private String filename;

    /**
     * The size of length's file, as a integer
     */
    private int size;

    /**
     * Initialize the name of file and set size equals to zero
     * @param filename is name's file
     */
    public AppendStringBuilder(String filename){
        this.filename = filename;
        this.size = 0;
    }

    /**
     * Read file for find length of file
     */
    @Override
    public void run() {
        FileReader reader = null;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            reader = new FileReader(filename);
            int n;
            while (( n = reader.read()) >= 0){
                stringBuilder.append((char)n);
            }
            if(reader != null) reader.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
        size = stringBuilder.length();
    }

    /**
     * Return result ,as a string
     * @return detail of file and size of file
     */
    public String toString(){
        return "Reading Alice-in-Wonderland-in-Wonderland.txt using FileReader, append to StringBuilder. Read "+size+" char.";
    }
}
