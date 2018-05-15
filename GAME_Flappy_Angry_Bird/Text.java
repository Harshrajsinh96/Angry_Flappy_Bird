import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text extends Actor
{
    /**
     * Act - do whatever the Text wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Color f = Color.WHITE;
    Color b = new Color(0,0,0,0);
    String text;
    int x;
    int y;
    
    public Text(String text){
       
       this.text = text; 
       setImage(new GreenfootImage(text, 20, f, b));
        
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
