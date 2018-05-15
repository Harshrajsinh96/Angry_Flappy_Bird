import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Template here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Template extends Actor
{
    /**
     * Act - do whatever the Template wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     */
    
    int objectSpeed = -13;
   
    //int CLOUD_INTERIA = 0.
    
    public void act() 
    {
        // Add your action code here.
        setLocation ( getX() + objectSpeed, getY());
        
    }
    
    public abstract void increasePoints(int score);
    public abstract void decreaseSpeed();
}
