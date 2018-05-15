/**
 * Write a description of class RadioStateOff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadioStateOff extends RadioState {

    public RadioStateOff( RadioButton rs )
    {
        super( rs ) ;
        
        rs.setImage("radio.png");
    }

    @Override
    public void doSwitchOn() {
        
        setImage("selected.png");
        rs_manager.setState( RadioStates.ON );
    }
    
    public String getState() { return "OFF"; }


}