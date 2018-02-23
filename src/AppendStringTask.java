import java.io.FileReader;
import java.io.IOException;

public class AppendStringTask implements Runnable {

    private int size;
    private String filename;

    public AppendStringTask(String filename){
        this.filename = filename;
        this.size = 0;
    }

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

    public String toString(){
        return "Reading Alice-in-Wonderland.txt using FileReader, append to String. Read "+size+" char.";
    }
}
