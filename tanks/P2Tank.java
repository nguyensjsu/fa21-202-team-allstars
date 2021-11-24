import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class P2Tank here.
 * 
 * @author Guru Karthik
 * @version 11/23/2021
 */
public class P2Tank extends Tank
{
    private Tank playerTank;
    private TankCommands upKey;
    private TankCommands leftKey;
    private TankCommands rightKey;
    private TankCommands downKey;
    /**
     * Act - do whatever the P1Tank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // if(Greenfoot.isKeyDown("space"))
            // playerTank.shoot();
        if(Greenfoot.isKeyDown("A"))
            leftKey.execute();
        if(Greenfoot.isKeyDown("D"))
            rightKey.execute();
        if(Greenfoot.isKeyDown("W"))
            upKey.execute();
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
    
    public void P2Tank(){
        this.playerTank = playerTank;
        
        this.upKey = new UpKey(this);
        this.leftKey = new LeftKey(this);
        this.rightKey = new RightKey(this);
        this.downKey = new DownKey(this);
    }
    
}
