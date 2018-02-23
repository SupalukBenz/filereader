import java.io.FileReader;
import java.io.IOException;


public class AppendStringBuilder implements Runnable{

    private String filename;
    private int size;

    public AppendStringBuilder(String filename){
        this.filename = filename;
        this.size = 0;
    }

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

    public String toString(){
        return "Reading Alice-in-Wonderland.txt using FileReader, append to StringBuilder. Read "+size+" char.";
    }
}
