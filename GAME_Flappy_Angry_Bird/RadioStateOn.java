/**
 * Write a description of class RadioStateOn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadioStateOn extends RadioState {

    public RadioStateOn( RadioButton rs )
    {
        super( rs ) ;
        
        rs.setImage("selected.png"); 
    }

    @Override
    public void doSwitchOff() {
        
        setImage("radio.png");
        rs_manager.setState( RadioStates.OFF );
        
    }
    
    public String getState() { return "ON"; }


}