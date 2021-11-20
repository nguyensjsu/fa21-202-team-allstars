import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class P1Tank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P1Tank extends Tank
{
    /**
     * Act - do whatever the P1Tank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
            shoot();
    }
}
