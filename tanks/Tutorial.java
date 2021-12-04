import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Tutorial Page Icon class
 * 
 * @Suresh Goud Mula 
 * @1.0
 */
public class Tutorial extends Actor
{
    public Tutorial(){
        GreenfootImage image = getImage();
        image.scale(175, 175);
    }
    
    /**
     * Act - do whatever the Tutorial wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mousePressed(this))
        {
        TutorialPage tutorialPage = new TutorialPage();
        Greenfoot.setWorld(tutorialPage);
        }
    }
}
