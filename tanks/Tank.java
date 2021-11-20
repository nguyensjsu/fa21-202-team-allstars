import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tank here.
 * 
 * @author Suresh Mula 
 * @version (a version number or a date)
 */
public abstract class Tank extends Actor
{
    static long bullet_interval = 200000000;
    long last_shot = -1;
    /**
     * Act - do whatever the Tank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Tank(){
        
    }
    
    public void shoot() {
        if(last_shot == -1 || System.nanoTime() - last_shot >= bullet_interval) {
            Bullet bullet = new Bullet();
            int x_offset;
            int y_offset;
            int rotation = getRotation();
            
            if(rotation == 0) {
                x_offset = 10;
                y_offset = 0;
            }else if(rotation == 90) {
                x_offset = 0;
                y_offset = 10;
            }else if(rotation == 180) {
                x_offset = -10;
                y_offset = 0;
            }else{
                x_offset = 0;
                y_offset = -10;
            }
            bullet.setRotation(rotation);
            
            getWorld().addObject(bullet, getX() + x_offset, getY() + y_offset);
            
            last_shot = System.nanoTime();
        }
    }
}
