import greenfoot.*; 

public class Bird extends Actor
{
    double dy = 0;
    double gr = 0.5;
    double BOOST_SPEED = -8;
    String key;
    GreenfootSound bckgrnd = new GreenfootSound("Background_Sound.mp3");
    GreenfootSound bird_sound = new GreenfootSound("Wheee.mp3");
    
    public Bird() {
        
        this.key = "space";
        
    }
    
     public Bird(String key) {
        
        this.key = key;
        
    }
    
    public double acceleration() {
        double speed = (9.81 * dy)/gr;
        return speed;
    }
    
    

    public void act() 
    {
        setLocation( getX(), (int)(getY()+ dy) );
        bckgrnd.play();
        if ( (getOneIntersectingObject(BottomPipe.class) != null) ||
            (getOneIntersectingObject(TopPipe.class) != null) || 
            (getOneIntersectingObject(Clouds.class) != null) ||
            (getOneIntersectingObject(airplane.class) != null) ||
            (getY() > getWorld().getHeight()) || (getY() < -100))
        {
            Died game_over = new Died();
            bckgrnd.stop();
            getWorld().addObject(game_over, getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop(); 
        }
        
        
          if(getOneIntersectingObject(Apple.class) != null){
            
            Apple c = (Apple)getOneObjectAtOffset(0,0, Apple.class);
            
            if(c!=null && c.allowed()) {
           
           // System.out.println("Apple found inside");
            c.increasePoints(5);
            
            }
            getWorld().removeObject(c);
            
            
            
        }
      
        
        if(getOneIntersectingObject(Grapes.class) != null){
            
            Grapes g = (Grapes)getOneObjectAtOffset(0,0, Grapes.class);
            
            System.out.println("graps found inside");
            if(g!=null && g.allowed()) {
           
            
            g.increasePoints(2);
            
            }
            getWorld().removeObject(g);
            
        }
        
        if (Greenfoot.isKeyDown(this.key) == true)
        {   
            bird_sound.play();
            dy = BOOST_SPEED ;
        }
        
        if ( dy > -5 )
            setRotation(-20);
        else
            setRotation(0);
        
        dy = dy + gr ;       
    }
}
