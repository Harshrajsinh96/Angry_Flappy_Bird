import greenfoot.*; 
public interface ScoreNotifier
{
    public void addObserver(Observers newObserver);
    public void notifyObserver();
}
