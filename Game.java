
import java.io.Serializable;


public class Game implements Serializable {
   private int xpos,ypos;

   public void move(int h, int v){
   
       xpos=xpos+h;
       ypos=ypos+v;
       
   }
   
   public void showPos(){
       System.out.println("Current Pos : "+xpos+","+ypos);
   }
   
}
