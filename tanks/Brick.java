import greenfoot.*;

/**
 * @author Sachin Pothukuchi 
 */
public class Brick extends UnmovableObjects
{
    int health;
    
    public Brick() {
        super();
        health = 1;
    }
    
    public void bulletCollision() {
        health--;
        
        if(health == 0){
            getWorld().removeObject(this);
        }
    }
}