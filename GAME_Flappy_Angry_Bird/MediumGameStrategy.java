import greenfoot.*;
import java.util.Random;
import java.util.*;

public class MediumGameStrategy extends GameStrategy
{
    int pipe_counter = 0;
    int flappy_counter = 0;
    int bird_count = 0;
    int score = 0;
    int prevScore = 0;
    //int score = 1;
    int FIRST_PIPE = 415;
    Score myscore = null;
    ScoreManager scoreManager;
    
    public MediumGameStrategy()
    {    
       
       Bird bird = new Bird();
       addObject(bird, 200, getHeight()/2);
       
        
       myscore = new Score();
       scoreManager = ScoreManager.getInstance();
       setScore(myscore);
        
       addObject(myscore, 70, 30);
    }
    
    public void act(){
        pipe_counter++ ;
        if (pipe_counter % 140 == 0)
        {
            BottomPipe pipe = new BottomPipe();
            GreenfootImage img_pipe = pipe.getImage();
            Random rndm_pipe = new Random();
            int  add_pipe = rndm_pipe.nextInt( getHeight()/4) + getHeight()/3;//4&3
            addObject(pipe, getWidth(), add_pipe + img_pipe.getHeight()/2);
            addObject(pipe, getWidth(), add_pipe + img_pipe.getHeight()/5);
            
           
            Clouds cloud = new Clouds();
            GreenfootImage img_cloud = cloud.getImage();
            Random rndm_cloud = new Random();
            int  add_cloud = rndm_cloud.nextInt( getHeight()/5) + 3;//5&5
            addObject(cloud, getWidth(), add_cloud + img_cloud.getHeight());
            
            myscore.addObserver(cloud);
            myscore.checkScore(score);
            
            Random rand = new Random();
            
            int  n = rand.nextInt(2) + 1;
            
            
            if(n == 1){
                Apple app = new Apple();
                GreenfootImage apple_img = app.getImage();
                addObject(app, getWidth(), apple_img.getHeight()*2);
            }
            else if(n ==2){
                Grapes grape = new Grapes();
                GreenfootImage grapes_img = grape.getImage();
                addObject(grape, getWidth(), grapes_img.getHeight()*5);
            }
        }
        
        if ( pipe_counter >= FIRST_PIPE)
        {
            if ( flappy_counter % 140 == 0 )
            {
               score = scoreManager.getScore() + 1 ; 
               myscore.setScore(score);
               scoreManager.setScore(score);
            }
            flappy_counter++ ;
        }
    }
}