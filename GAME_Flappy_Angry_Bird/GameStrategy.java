import greenfoot.*;
import java.util.Random;
import java.util.*;

public class GameStrategy extends World
{
   int scoreKeeper;
   Store store = Store.getInstance();
    
    public GameStrategy()
    {    
        super(1200, 800, 1, false);
       
       
        GreenfootImage bg = new GreenfootImage("36749659-sea-wallpaper-hd.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        setPaintOrder(Score.class, Clouds.class, Died.class, Bird.class, BottomPipe.class);
       
        
        
    }
    
  
    
    public void setScore(Score s) {
        store.setScore(s);
    }
    
     public void setSpeed(int s) {
        store.setSpeed(s);
    }
    
    public void act(){  }
}