
import java.io.DataInputStream;
import java.io.FileInputStream;
public class DataInputExample {

    public static void main(String[] args) throws  Exception{
        
        //here we are reading primitive data from "trail.txt"
        
       FileInputStream fis=new FileInputStream("h:/data/trail.txt");
     
       DataInputStream dis=new DataInputStream(fis);
       int v1=dis.readInt();
       double v2=dis.readDouble();
       boolean v3=dis.readBoolean();
        dis.close();
        
        fis.close();
        
        System.out.println("Employee ID : "+v1);
        System.out.println("Employee Salary : "+v2);
        System.out.println("Employee Status : "+v3);
    }
}
