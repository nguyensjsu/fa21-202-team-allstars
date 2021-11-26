import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OneButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OneButton extends Actor
{
    public OneButton(){
        GreenfootImage image = getImage();
        image.scale(175, 100);
    }
    
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mousePressed(this))
    {
        LevelOne one = new LevelOne();
        LevelDecorator oneD = new LevelDecorator(one);
        one.setDaddy(oneD);
        Greenfoot.setWorld(oneD);
        oneD.createLevel();
    }
    }
}
