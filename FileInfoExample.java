
import java.io.File;

public class FileInfoExample {

    public static void main(String[] args) {
   
        File f=new File("h:/data/Kushagra.txt");
        long size=f.length();
        System.out.println(size);
    }
}
