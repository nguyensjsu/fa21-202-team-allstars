import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class AI_tank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AiTank extends Tank
{
    private TankCommands upKey;
    private TankCommands leftKey;
    private TankCommands rightKey;
    private TankCommands downKey;
    TankCommands keys[];
    /**
     * Act - do whatever the AI_tank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public AiTank(){
        upKey = new UpKey(this);
        leftKey = new LeftKey(this);
        rightKey = new RightKey(this);
        downKey = new DownKey(this);
        keys = new TankCommands[]{upKey,downKey,leftKey,rightKey};
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 45, image.getHeight() - 15);
        setImage(image);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
