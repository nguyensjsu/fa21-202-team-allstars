import greenfoot.*;
/**
 * Write a description of class Health0Strategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Health0Strategy extends Actor implements IBulletCollisionStrategy 
{
    public Health0Strategy(){ }
    /**
     * Display the tank destroyed (after all the lives are lost)
     */
    public void display(Tank t){
         setImage("skull.png");
    }
    
}
