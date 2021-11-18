import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Barrier class for showing distinction between barrier and the world
 * 
 * @author Sachin Pothukuchi 
 * @version 1.0
 */
public class Barrier extends UnmovableObjects
{
    public Barrier() {
        super();
        GreenfootImage image = new GreenfootImage(5, 600);
        image.setColor(Color.BLACK);
        image.fill();
        this.setImage(image);
    }
    /**
     * Act - do whatever the Barrier wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void bulletCollision() {
        //do nothing
    }
}
