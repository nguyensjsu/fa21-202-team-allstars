import greenfoot.*;

/**
 * Write a description of class RightKey here.
 * 
 * @author GuruKarthik 
 * @version 11/23/2021
 */
public class RightKey implements TankCommands
{
    /**
     * Constructor for objects of class RightKey
     */
    private Tank tank;
    public RightKey(Tank tank)
    {
        this.tank = tank;
    }

    public void execute()
    {
        // actor.setRotation(actor.getRotation()+90);
        int actorX = this.tank.getX();
        int actorY = this.tank.getY();
        if(this.tank.getObstacle("right") == null){
            this.tank.setLocation(actorX+2, actorY);
        }
        // Actor actor2 = getOneObjectAtOffset(400, 400, Actor.class);
        
    }
}
