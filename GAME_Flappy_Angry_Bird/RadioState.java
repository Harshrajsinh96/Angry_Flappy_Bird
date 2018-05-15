public class RadioState implements RadioSetState {
 
	RadioButton rs_manager;
	 
	public RadioState(RadioButton rs) {
        rs_manager = rs ;
	}
	
	public void setImage(String filename) {
	    System.out.println("changing stqte to "+filename);
	    rs_manager.setImage(filename);
	}
	
	public String getState() { return "none"; }

	public void doSwitchOn() {
        System.out.println( "Power On is not valid in " + this.getClass().getName() + " state." );
	}

	public void doSwitchOff() {
        System.out.println( "Power Off is not valid in " + this.getClass().getName() + " state." );
	}
	 
}
 