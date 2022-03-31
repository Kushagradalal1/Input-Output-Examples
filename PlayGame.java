
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hp
 */
public class PlayGame {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the choice New Game or Old Game : ");
        String ch=sc.next();
        Game g=null;
        
        if(ch.equalsIgnoreCase("new")){
           g=new Game(); 
        }else if(ch.equalsIgnoreCase("old")){
            FileInputStream fis=new FileInputStream("h:/data/trail.txt");
            
            ObjectInputStream ois=new ObjectInputStream(fis);
            g=(Game) ois.readObject();
            
            
        }
        
        System.out.println("Enter the horizontal movement : ");
        int h=sc.nextInt();
        System.out.println("Enter the vertical movement   : ");
        int v=sc.nextInt();
        
        
        g.move(h, v);
        g.showPos();
        System.out.println("Saving Game..");
        FileOutputStream fos=new FileOutputStream("h:/data/trail.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
         
        oos.writeObject(g);
        oos.close();
        fos.close();
        
        System.out.println("Ending Game..");
    }
}
