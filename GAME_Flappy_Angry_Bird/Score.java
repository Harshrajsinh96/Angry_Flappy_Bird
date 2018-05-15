import greenfoot.*;
import java.lang.Object;
import java.util.ArrayList;

public class Score extends Actor  implements ScoreNotifier
{
    private ArrayList<Observers> observers;
    
    public Score() 
    {
        GreenfootImage newImage = new GreenfootImage(125,50);
        setImage(newImage);
        observers = new ArrayList<Observers>();
        
        this.setScore(0);
    }    

    public void checkScore(int score){
                notifyObserver();
    }
    
    public void setScore(int score)
    {
        GreenfootImage newImage = getImage();
        newImage.clear();
        
        newImage.setColor(new Color(0,0,0,200));
        newImage.fill();
        newImage.setColor(Color.WHITE);
        newImage.setFont(newImage.getFont().deriveFont(20));
        newImage.drawString("Score " + score, 15, 31);
        setImage(newImage);
    }

    public void addObserver(Observers newObserver)
    {
        observers.add(newObserver);
        //System.out.println("Observer registered: " + newObserver);
    }
    public void removeObserver(Observers observer)
    {
            //System.out.println("Observer unregistered: " + observer);
            observers.remove(observers.indexOf(observer));
        
    }
    public void notifyObserver()
    {
            System.out.println(" Notifing observer ");
            for(Observers observer : observers)
            {
                //System.out.println("Name: " + observer);
                observer.updateSpeed();
            }
            
    }
}
