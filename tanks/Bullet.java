import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * @author Sachin Pothukuchi 
 */
public class Bullet extends Actor
{
    static int speed = 2;
    public Bullet() {
        setRotation(0);
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 30, image.getHeight() - 30);
    }
    public void act()
    {
        move(speed);
        
        if(isAtEdge()) {
            getWorld().removeObject(this);
        }
        
        List<UnmovableObjects> list =  getIntersectingObjects(UnmovableObjects.class);
        if( list.size() > 0){
            for(UnmovableObjects o: list)
                o.bulletCollision();
            getWorld().removeObject(this);
        }
    }
    
}