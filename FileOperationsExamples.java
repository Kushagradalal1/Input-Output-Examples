//File Class Operations in Java..

import java.io.File;
import java.io.IOException;

public class FileOperationsExamples {

    public static void main(String[] args) throws IOException {
   
 //       File f=new File("h:/data/abcd");
  
        //File f1=new File("h:/data/info.txt");
        //File f2=new File("h:/data/kush.txt");
        //boolean res=f.mkdir();
        //boolean res=f1.renameTo(f2);
        
        File f=new File("h:/data/nitti.txt");
        boolean res=f.createNewFile();
        if(res){
            System.out.println("Operation Successful..");
        }else{
            System.out.println("Operation Failed...");
        }
    }
    
}
/*

    File Operations:

    boolean  mkdir() //To make a directory().
    boolean delete() //to delete a directory().Also Delete the File..
    boolean renameTo() //file to be rename ..
    createNewFile()     //Empty file creating..
*/