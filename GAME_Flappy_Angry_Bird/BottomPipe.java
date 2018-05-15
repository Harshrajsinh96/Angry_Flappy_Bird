import greenfoot.*;

public class BottomPipe extends Actor
{
    int pipe_speed = -8;
    public void act() 
    {
        setLocation ( getX() + pipe_speed, getY());
    }
    
    public void reducePipeSpeed(){
        pipe_speed+= 0.5;
    }
    
}
