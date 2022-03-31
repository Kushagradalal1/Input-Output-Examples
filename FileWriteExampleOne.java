
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hp
 */
public class FileWriteExampleOne {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //here we are writing the data to a file..
        
        //step 1 open a Stream..
        FileOutputStream fos=new FileOutputStream("h:/data/rohan.txt",true);
        //Step 2 write the data to the stream..
        fos.write(95);
        fos.write(96);
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.write(63);
        //closed the stream..
        fos.close();
    }
}
