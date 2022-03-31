
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOuputExample {

    public static void main(String[] args) throws Exception {
   
        //primitives data..
        
        int eno=01;
        double salary=12000.50;
        boolean married=true;
        //We are connecting the instanst of FileOutputStream..
        
        FileOutputStream fos=new FileOutputStream("h:/data/trail.txt");
        
        //Now the Second Step is to Create the DataOutputStream ..
        
        DataOutputStream dos=new DataOutputStream(fos);
       
        dos.write(eno);
        dos.writeDouble(salary);
        dos.writeBoolean(married);
         
        dos.close();
        fos.close();
        
        System.out.println("Data Successfully Stored..");

    }
}
/*
Your Output Will be Stored in the From Of some Garbage values Becoz's the Reason was notepad dosn't 
stored some primitive values its only stored the text formate that's why?

*/