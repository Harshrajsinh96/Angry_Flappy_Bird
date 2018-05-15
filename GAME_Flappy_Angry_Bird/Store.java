/**
 * Write a description of class Store here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Store  
{
   
    
    private static Store single_instance = null;
    private String difficulty;
    private int cloudSpeed;
    private Score score;
    
    // private constructor restricted to this class itself
    private Store()
    {
       difficulty = "";
    }
 
    // static method to create instance of Singleton class
    public static Store getInstance()
    {
        
        if (single_instance == null) {
           
           single_instance = new Store();
           
        }
       
            
            
        return single_instance;
    }
   
    public void setScore(Score s) {
         this.score = s;
         
     }
    
    public Score getScore() {
        return this.score;
    }
    
    public void setSpeed(int s) {
         this.cloudSpeed = s;
         
     }
    
    public int getSpeed() {
        return this.cloudSpeed;
    }
   
    
    public String getDiffculty() {
            return difficulty;
    }
    
    public void setDiffculty(String d) {
        
        System.out.println("diffi s "+d);
        
            this.difficulty = d;
    }
   
}
