import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TwoButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TwoButton extends Actor
{
    public TwoButton(){
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
        //LevelTwo two = new LevelTwo();
        //LevelDecorator twoD = new LevelDecorator(two);
        //two.setDaddy(twoD);
        //Greenfoot.setWorld(twoD);
        //twoD.createLevel();
    }
    }
}
