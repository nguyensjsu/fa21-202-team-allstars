import greenfoot.*;
/**
 * Write a description of class Health0Strategy here.
 * 
 * @author Shafeeq
 * @version 1.0
 */
public class Health0Strategy extends Actor implements IBulletCollisionStrategy 
{
    // Constructor 
    public Health0Strategy(){ }
    
    /**
     * Display the tank destroyed (after all the lives are lost)
     */
    public void display(Tank t){
        t.setImage("skull.png");
    }
    
    /**
     * Get the current strategy the name
     */
    public String getCurrentStrategy(){
        return this.getClass().getSimpleName() ;
    }
}
