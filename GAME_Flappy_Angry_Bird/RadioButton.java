import greenfoot.*; 

public class RadioButton extends Actor {
 
    RadioState StateOn ;
    RadioState StateOff ;

    RadioState currentState ;
    
    String label;
    
    public RadioButton(String label)
    {
        StateOn = new RadioStateOn(this);
        StateOff = new RadioStateOff(this);
        
        currentState = new RadioStateOff(this);
        
        this.label = label;
        
        
    }
    
    
  
     
    public void stateOn() {
        
       
        
        currentState.doSwitchOn();
    }
     
    public void stateOff() {
       
        currentState.doSwitchOff();
    }
    
     
    void setState(RadioStates nextState) {
        switch( nextState ) {
            case OFF :          currentState = StateOff ; break ;
            case ON :           currentState = StateOn ; break ;
        }

    }
    
    public void showState()
    {
        System.out.println( "Current State: " + currentState.getClass().getName());
    }
    
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
           
            //currentState.doSwitchOn();
            MenuPage world = (MenuPage)getWorld();
            
            for (RadioButton obj  : world.getRadioButtons())
            {
                obj.stateOff();
            }
            
             Store s = Store.getInstance();
             s.setDiffculty(this.label);
            
            currentState.doSwitchOn();
            
        }
    }
     
}