import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * @author Sachin Pothukuchi 
 */
public class Bullet extends Actor
{
    static int speed = 5;
    public Bullet() {
        setRotation(0);
        GreenfootImage image = getImage();
        image.scale(40, 30);
    }
    public void act()
    {
        move(speed);
        
        if(isAtEdge()) {
            getWorld().removeObject(this);
        } else {
            List<UnmovableObjects> list =  getIntersectingObjects(UnmovableObjects.class);
            if( list.size() > 0){
                for(UnmovableObjects o: list)
                    o.bulletCollision();
                getWorld().removeObject(this);
            }
        }
    }
    
}