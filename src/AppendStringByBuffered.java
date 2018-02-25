import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * AppendStringBuilder class implements Runnable an interface
 * for implement run() method to read file by BufferedReader and return
 * the length's result
 * @author Supaluk Jaroensuk
 */
public class AppendStringByBuffered implements Runnable{
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
    public AppendStringByBuffered(String filename){
        this.filename = filename;
        this.size = 0;
    }

    /**
     * Read file for find length of file
     */
    @Override
    public void run() {
        String data;
        String output = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            while((data = bufferedReader.readLine()) != null){
                output = output + data +'\n';
            }
            if(bufferedReader != null )bufferedReader.close();

        }catch (FileNotFoundException ex){
            System.out.println("File not found : " + ex);
        }catch (IOException ex){
            ex.printStackTrace();
        }
        this.size = output.length();
    }

    /**
     * Return result ,as a string
     * @return detail of file and size of file
     */
    public String toString(){
        return "Reading Alice-in-Wonderland-in-Wonderland.txt using BufferedReader, append to lines to String. Read " + size + " char.";
    }

}
