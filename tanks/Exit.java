import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Actor
{
    public Exit(){
        GreenfootImage image = getImage();
        image.scale(175, 100);
    }
    /**
     * Act - do whatever the Exit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mousePressed(this))
    {
        resetGame();
        Greenfoot.setWorld(new MainMenu());
    }
        
    }
    
    public void resetGame(){
        LevelHandler levelHandler = LevelHandler.getInstance();
        levelHandler.reset();
        ScoreManager.reset();
    }
}
