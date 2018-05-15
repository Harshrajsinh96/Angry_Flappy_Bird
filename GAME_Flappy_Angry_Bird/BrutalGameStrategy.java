import greenfoot.*;
import java.util.Random;
import java.util.*;

public class BrutalGameStrategy extends GameStrategy
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
    
    public BrutalGameStrategy()
    {    
       
        
          Bird bird = new Bird();
          Bird bird1 = new Bird("l");
          addObject(bird, 200, getHeight()/2);
          addObject(bird1, 300, getHeight()/2);
       
        
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
            
            
            if (pipe_counter % 280 == 0){
            Butterfly butterfly = new Butterfly();
            GreenfootImage img_butterfly = butterfly.getImage();
            addObject(butterfly, getWidth(), img_butterfly.getHeight()*4);
            butterfly.turn(180);
            }
             if(score == prevScore+5)
            {
                airplane airplane = new airplane();
                GreenfootImage plane_image = airplane.getImage();
                addObject(airplane, getWidth(), plane_image.getHeight()*1);
                prevScore += score;
            }
           
            //if (pipe_counter % 140 !=0 && pipe_counter % 70 !=0)
            //{
              //  TopPipe pipe2 = new TopPipe();
                //GreenfootImage img_pipe2 = pipe2.getImage();
               // Random rndm_pipe2 = new Random();
               // int  add_pipe2 = rndm_pipe2.nextInt( getHeight()) + getHeight()/3;//4&3
                //addObject(pipe2, getWidth(), add_pipe2 + img_pipe2.getHeight()/7);
           
                //addObject(pipe2, getWidth(),1);
                //pipe2.turn(180);
            //}
            Clouds cloud = new Clouds();
            GreenfootImage img_cloud = cloud.getImage();
            Random rndm_cloud = new Random();
            int  add_cloud = rndm_cloud.nextInt( getHeight()/5) + 3;//5&5
            addObject(cloud, getWidth(), add_cloud + img_cloud.getHeight());
            
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