/**
 * Write a description of class ScoreManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreManager  
{
    // instance variables - replace the example below with your own
    
    int score = 0;

    
    static ScoreManager scoreManager = null;
    
    public static ScoreManager getInstance(){
        if(scoreManager == null){
            scoreManager = new ScoreManager();
        }
        return scoreManager;
    }
    
    public int getScore(){
        return score;
    }
    
    
    public void setScore(int val){
        score = val;
    }
    
   
    
}
