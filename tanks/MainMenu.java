import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{

    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 600, 1);
        showMainMenu();
    }
    public void showMainMenu(){
      Menu menu = new Menu();
        addObject(menu, 350, 225);
        OneButton oneButton = new OneButton();
        TwoButton twoButton = new TwoButton();
        addObject(oneButton,350,275);
        addObject(twoButton,350,425);
    }
}
