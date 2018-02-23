import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AppendStringByBuffered implements Runnable{

    private String filename;
    private int size;

    public AppendStringByBuffered(String filename){
        this.filename = filename;
        this.size = 0;
    }

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

    public String toString(){
        return "Reading Alice-in-Wonderland.txt using BufferedReader, append to lines to String. Read " + size + " char.";
    }

}
