
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileWriteExampleTwo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        FileOutputStream fos=new FileOutputStream("h:/data/trail.txt");
        String msg="hello users! this contents are written by java code..";
        
        byte b[]=msg.getBytes();
        
        fos.write(b, 6, 25);
        fos.write(b);
        
        fos.close();
    }
}
