import greenfoot.*;

/**
 * Write a description of class LeftKey here.
 * 
 * @author Guru Karthik
 * @version 11/23/2021
 */
public class LeftKey implements TankCommands
{
    /**
     * Constructor for objects of class LeftKey
     */
    private Tank tank;
    public LeftKey(Tank tank)
    {
        this.tank = tank;
    }

    public void execute()
    {
        // actor.setRotation(actor.getRotation()-90);
        // // actor.turn(-90);
        int actorX = this.tank.getX();
        int actorY = this.tank.getY();
        if(this.tank.getObstacle("left") == null){
            this.tank.setLocation(actorX-2, actorY);
        }
    }
}
