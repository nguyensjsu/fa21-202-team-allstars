import greenfoot.*;
/**
 * Write a description of class Health1Strategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Health1Strategy extends Actor implements IBulletCollisionStrategy
{   
    /** 
     * Display the tank (not destroyed)
     */
    public void display(Tank t){
        setImage("skull.png");
    }
    
}
