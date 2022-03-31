
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReaderExampl {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        FileReader fr=new FileReader("h:/data/trail.txt");
        
        char ch[]=new char[10];
        
        fr.read(ch);
        
        for(char tmp : ch){
            System.out.print(tmp);
        }
        
        fr.close();
    }
}
