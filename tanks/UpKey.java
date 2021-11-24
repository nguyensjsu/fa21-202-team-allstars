import greenfoot.*;

/**
 * Write a description of class UpKey here.
 * 
 * @author Guru Karthik
 * @version 11/23/2021
 */
public class UpKey implements TankCommands
{
    /**
     * Constructor for objects of class UpKey
     */
    private Tank tank;
    public UpKey(Tank tank)
    {
        this.tank = tank;
    }

    public void execute()
    {
        int actorX = this.tank.getX();
        int actorY = this.tank.getY();
        if(this.tank.getObstacle("up") == null){
            this.tank.setLocation(actorX, actorY-2);
        }
    }
}
