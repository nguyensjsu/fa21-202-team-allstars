import greenfoot.*;

/**
 * Write a description of class DownKey here.
 * 
 * @author Guru Karthik
 * @version 11/23/2021
 */
public class DownKey implements TankCommands
{
    /**
     * Constructor for objects of class DownKey
     */
    private Tank tank;
    public DownKey(Tank tank)
    {
        this.tank = tank;
    }

    public void execute()
    {
        int actorX = this.tank.getX();
        int actorY = this.tank.getY();
        if(this.tank.getObstacle("down") == null){
            this.tank.setLocation(actorX, actorY+2);
        }
    }
}
