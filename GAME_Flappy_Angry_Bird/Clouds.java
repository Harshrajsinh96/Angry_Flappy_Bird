import greenfoot.*;

public class Clouds extends Actor implements Observers
{
    int cloud_speed;
    int CLOUD_SIZE = 1;
    Store store;
    
    public Clouds() {
        
        store = Store.getInstance();
        cloud_speed = store.getSpeed();
        
    }
  

    public void act() 
    {
        
        setLocation ( getX() + cloud_speed, getY());
    }  
    
    public void updateSpeed()
    {
        System.out.println("Speed is "+cloud_speed);
        this.cloud_speed = cloud_speed -1 ;
        store.setSpeed(cloud_speed);
       
    }
    
}