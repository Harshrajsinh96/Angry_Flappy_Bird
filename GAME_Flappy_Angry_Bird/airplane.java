import greenfoot.*;

public class airplane extends Actor
{
    int PLANE_SPEED = -7;
    public void act() 
    {
        setLocation ( getX() + PLANE_SPEED, getY());
    }    
}
