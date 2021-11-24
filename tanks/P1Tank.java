import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        // if(Greenfoot.isKeyDown("space"))
            // playerTank.shoot();
        if(Greenfoot.isKeyDown("left"))
            leftKey.execute();
        if(Greenfoot.isKeyDown("right"))
            rightKey.execute();
        if(Greenfoot.isKeyDown("up"))
            upKey.execute();
        if(Greenfoot.isKeyDown("down"))
            downKey.execute();
    }
    
    public UnmovableObjects getObstacle(String direction){
        int actorX = getX();
        int actorY = getY();
        UnmovableObjects a = null;
        switch (direction) {
            case "left":
                a = (UnmovableObjects)getOneObjectAtOffset(-25, 0, Actor.class);
                break;
            case "right":
                a = (UnmovableObjects)getOneObjectAtOffset(25, 0, Actor.class);
                break;
            case "up":
                a = (UnmovableObjects)getOneObjectAtOffset(0, -25, Actor.class);
                break;
            case "down":
                a = (UnmovableObjects)getOneObjectAtOffset(0, 25, Actor.class);
                break;
        }
        return a;
    }
}
