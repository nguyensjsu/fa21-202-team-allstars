import greenfoot.*;
/**
 * Write a description of class Health1Strategy here.
 * 
 * @author Shafeeq
 * @version 1.0
 */
public class Health1Strategy extends Actor implements IBulletCollisionStrategy
{   
    /** 
     * Display the tank (not destroyed)
     */
    public void display(Tank t){
        String imageName= t.getClass().getSimpleName() + "_Damaged.png";
        GreenfootImage image = new GreenfootImage(imageName);
        image.scale(image.getWidth() - 45, image.getHeight() - 15);
        t.setImage(image) ;
    }
    
    public String getCurrentStrategy(){
        return this.getClass().getSimpleName() ;
    }
}
