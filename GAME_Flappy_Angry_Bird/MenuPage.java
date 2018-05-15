import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.HashMap;
import java.util.ArrayList;
/**
 * Write a description of class MenuPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuPage extends World
{

    /**
     * Constructor for objects of class MenuPage.
     * 
     */
    
    ArrayList<RadioButton> radioButtons = new ArrayList<RadioButton>()  ;
    Store store = Store.getInstance();
    public MenuPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1, false);
        
        /**
         * Set background image and match scale
         */
        GreenfootImage bg = new GreenfootImage("intro.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        setupMenuSystem(); 
       
       
        
        
    }
    
    public ArrayList<RadioButton> getRadioButtons() {
        
        return radioButtons;
    }
    
    public void createStrategyScreen() {
        
      
        
      
        
        Text title = new Text("Select difficulty");
        
        addObject(title,getWidth()/2+20, 200);
        
        RadioButton easy = new RadioButton("Easy");
        Text easyLabel  =  new Text("Easy");
        
        RadioButton medium = new RadioButton("Medium");
        Text mediumLabel  =  new Text("Medium");

        RadioButton hard = new RadioButton("Hard");
        Text hardLabel  =  new Text("Hard");
        
        RadioButton brutal = new RadioButton("Brutal");
        Text brutalLabel  =  new Text("Brutal");
        
        addObject(easy,getWidth()/2-150, 300);
        addObject(easyLabel,getWidth()/2-100, 300);
        
        addObject(medium,getWidth()/2-150, 360);
        addObject(mediumLabel,getWidth()/2-85, 360);
        
        addObject(hard,getWidth()/2-150, 420);
        addObject(hardLabel,getWidth()/2-95, 420);
        
        addObject(brutal,getWidth()/2-150, 480);
        addObject(brutalLabel,getWidth()/2-95, 480);
        
        radioButtons.add(easy);
        radioButtons.add(medium);
        radioButtons.add(hard);
        radioButtons.add(brutal);
        
        switch(store.getDiffculty()) {
        
            case "Easy" : easy.stateOn(); break;
            default :
            case "Medium" : medium.stateOn(); break;
            case "Hard" : hard.stateOn(); break;
            case "Brutal" : brutal.stateOn(); break;
        }
        
        
        MenuItem back = new MenuItem("end.png",getWidth()/2-100, 580,this) ;
        Command triggerEnd = new ConcreteCommand();
        
        triggerEnd.setReceiver(
                new Receiver() {
                    public void doAction() {
                       
                        removeObject(easy);
                        removeObject(easyLabel);
        
                        removeObject(medium);
                        removeObject(mediumLabel);
        
                        removeObject(hard);
                        removeObject(hardLabel);
        
                        removeObject(brutal);
                        removeObject(brutalLabel);
                        
                        removeObject(back);
                       
                        radioButtons.clear();
                        System.out.println("Current difficulty is "+store.getDiffculty());
        
                        setupMenuSystem();
             
                    }
                }
        );
        
        back.setCommand( triggerEnd );
    }
    
   
    
    public void setupMenuSystem() {
        
         
         
        MenuItem start = new MenuItem("startbutton.png",getWidth()/2+10, 280,this) ;
        MenuItem difficulty = new MenuItem("difficulty.png",getWidth()/2+10, 380,this) ;
       
        
        Command triggerStart = new ConcreteCommand();
        Command triggerDifficulty = new ConcreteCommand();
        
        
        FlappyWorld w = new FlappyWorld();
        
        
        
        w.changeStrategy(store.getDiffculty());
        
        triggerStart.setReceiver(
                new Receiver() {
                    public void doAction() {
                       
                        w.start();
             
                    }
                }
        );

        triggerDifficulty.setReceiver(
                new Receiver() {
                    public void doAction() {
                        
                        removeObject(start);
                        removeObject(difficulty);
                       
                        
                        createStrategyScreen();
             
                    }
                }
        );
        
        start.setCommand( triggerStart );
        difficulty.setCommand( triggerDifficulty );
        

    }
    
}
