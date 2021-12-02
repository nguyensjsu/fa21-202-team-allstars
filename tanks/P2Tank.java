import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class P2Tank here.
 * 
 * @author Guru Karthik
 * @version 11/23/2021
 */
public class P2Tank extends Tank
{
    private TankCommands upKey;
    private TankCommands leftKey;
    private TankCommands rightKey;
    private TankCommands downKey;
    /**
     * Act - do whatever the P1Tank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public P2Tank(){
        this.upKey = new UpKey(this);
        this.leftKey = new LeftKey(this);
        this.rightKey = new RightKey(this);
        this.downKey = new DownKey(this);
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 45, image.getHeight() - 15);
        setImage(image);
    }
    
    public void act()
    {
        if(this.health>0){
            if(Greenfoot.isKeyDown("R"))
                this.shoot();
            if(Greenfoot.isKeyDown("A"))
                this.leftKey.execute();
            if(Greenfoot.isKeyDown("D"))
                this.rightKey.execute();
            if(Greenfoot.isKeyDown("W"))
                this.upKey.execute();
            if(Greenfoot.isKeyDown("S"))
                this.downKey.execute();
        }
    }
    
}
