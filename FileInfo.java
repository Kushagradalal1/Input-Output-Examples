
import java.io.File;


public class FileInfo {
    public static void main(String[] args) {
     
        File f=new File("h:/data");

        if(f.isDirectory()){
            String names[]=f.list();
            System.out.println(names);
        
            for(String name: names){
             System.out.println(name);
            }   
        }else{
            System.out.println("Directory is not Available..");
        }
        
        /*
        //boolean res=f.isHidden();
        boolean res=f.canWrite();
        System.out.println(res);
        */
      
        /*if(f.exists()){
        long n=f.length();
        System.out.println("Length : "+n);
        }else{
            System.out.println("Not Available..");
        }
        */
    }
}
/*

    Methods of File Class:
    
    1) long length()    //find the lenght of the file.
    if file dosnt exsist then it will be consider as a Zero O/p.

    2) boolean exists()     //will return true if the file exsist otherwise false.
    3) boolean isHidden()   //returns true if its a hidden file otherwise false.
    4) boolean canWrite()   //returns true if we can write to the file  (false if file is read-only).
    5) String[] list()      //can find the elements in a folder and return their names as a String[].
    6) isDirectory()        //Checks the directory is available or not..
    7) isFile()             //Checks the File is avilable or not..
*/