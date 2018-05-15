import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Grapes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grapes extends Template
{
    /**
     * Act - do whatever the Grapes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
   ScoreManager scoreManager;
    Store store;
    Score sc;
    BottomPipe bp = new BottomPipe();
    
    boolean flag;
    public Grapes(){
        
        setImage("grapes.png"); 
        
          flag = true;
        scoreManager = ScoreManager.getInstance();
        store = Store.getInstance();
        sc = store.getScore();
        
    }
    public boolean allowed() { return flag; }
    
     public void increasePoints(int score){
        
       
        flag = false;
        
        score = scoreManager.getScore() + score;
        scoreManager.setScore(score);
      
        sc.setScore(scoreManager.getScore());
    }
    
    public void decreaseSpeed(){
        bp.reducePipeSpeed();
    }
}
