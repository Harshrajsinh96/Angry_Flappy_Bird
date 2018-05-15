import greenfoot.*;
import java.util.Random;
import java.util.*;

public class FlappyWorld
{
    
    GameStrategy gameStrategy;
    Store store = Store.getInstance();
   
    public FlappyWorld()
    {    
       gameStrategy = new MediumGameStrategy();
       
       
    }
    
    
    public void changeStrategy(String difficulty) {
        
         switch(difficulty) {
        
            case "Easy" : gameStrategy = new EasyGameStrategy(); break;
            default :
            case "Medium" :gameStrategy = new MediumGameStrategy(); break;
            case "Hard" :gameStrategy = new HardGameStrategy(); break;
            case "Brutal" : gameStrategy = new BrutalGameStrategy(); break;
        }
        
    }
    
    public void start() {
        Greenfoot.setWorld(gameStrategy);
    }
    
}