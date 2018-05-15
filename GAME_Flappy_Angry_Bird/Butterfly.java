import greenfoot.*;

public class Butterfly extends Actor
{
    int BUTTERFLY_SPEED = -5;
    public void act() 
    {
        setLocation ( getX() + BUTTERFLY_SPEED, getY());
    }    
}
