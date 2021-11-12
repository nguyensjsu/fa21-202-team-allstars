import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Sachin Pothukuchi 
 */
public abstract class UnmovableObjects extends Actor
{
    public void act()
    {
        // doesnt act as they are immovable
    }
    
    /**
     * called whenever bullets collide
     */
    public abstract void bulletCollision();
}