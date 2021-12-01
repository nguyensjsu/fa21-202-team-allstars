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
        image.scale(30, 30);
    }
    public void act()
    {
        move(speed);
        
        if(isAtEdge()) {
            getWorld().removeObject(this);
        } else {
            boolean removed = false;
            List<UnmovableObjects> list =  getIntersectingObjects(UnmovableObjects.class);
            if( list.size() > 0){
                for(UnmovableObjects o: list)
                    o.bulletCollision();
                getWorld().removeObject(this);
                removed = true;
            }
            
            if(! removed) {
                List<Tank> list2 =  getIntersectingObjects(Tank.class);
                if( list.size() > 0){
                    for(Tank o: list2)
                        o.bulletCollision();
                    getWorld().removeObject(this);
                    removed = true;
                }
            }
        }
    }
    
}