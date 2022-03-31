
import java.io.FileWriter;
import java.io.IOException;

public class WritterExample {
    public static void main(String[] args) throws IOException {

        FileWriter fw=new FileWriter("h:/data/trail.txt");
        
        String msg="Some data Storing to file using writer methods which is text based stream";
        
        fw.write(msg);
        
        fw.close();
        
        System.out.println("Data Stored..");
    }
}
