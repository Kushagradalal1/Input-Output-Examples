
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReadExampleOne {

    public static void main(String[] args) throws FileNotFoundException, IOException {
   
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the File Name Including Path :");
        String file=sc.next();
        
        //Open Stream ..
        
        FileInputStream fis=new FileInputStream(file);
        //Read the Data from Stream..
        
        System.out.println((char)fis.read()); //A
        System.out.println((char)fis.read()); //B
        System.out.println((char)fis.read()); //C
        fis.skip(3);   //D , E , F
        System.out.println((char)fis.read()); //G
        System.out.println((char)fis.read()); //H


        /*
        while(true){
        int n=fis.read();
        if(n==-1)break;
        System.out.println((char)n);
        }
         
        //Close the Stream..
        fis.close();
        */        
    }
}
