import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuItem extends Actor
{
    /**
     * Act - do whatever the MenuItem wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String filename;
    private Command theCommand ;
    
    public MenuItem(String filename,int x,int y,World world){
        
         this.filename = filename;
            
        world.addObject(this,x,y);
        setImage(filename); 
        
       
    
    }
    
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
           
             invoke();
            
        }
    }
    
    public void setCommand(Command cmd) {
	    theCommand = cmd ;
	}

	public void invoke() {
	    theCommand.execute();
	}
	
}
