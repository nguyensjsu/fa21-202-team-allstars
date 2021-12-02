import greenfoot.*;

/**
 * Write a description of class P1Tank here.
 * 
 * @author Guru Karthik
 * @version 11/23/2021
 */
public class P1Tank extends Tank
{
    private TankCommands upKey;
    private TankCommands leftKey;
    private TankCommands rightKey;
    private TankCommands downKey;

    /**
     * Act - do whatever the P1Tank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public P1Tank(){
        upKey = new UpKey(this);
        leftKey = new LeftKey(this);
        rightKey = new RightKey(this);
        downKey = new DownKey(this);
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 45, image.getHeight() - 15);
        setImage(image);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
            leftKey.execute();
        if(Greenfoot.isKeyDown("right"))
            rightKey.execute();
        if(Greenfoot.isKeyDown("up"))
            upKey.execute();
        if(Greenfoot.isKeyDown("down"))
            downKey.execute();
        if(Greenfoot.isKeyDown("space"))
            this.shoot();
    }
    
    public void bulletCollision(){
        
    }
}
