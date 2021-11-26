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
    long bullet_interval = 200000000;
    long last_shot = -1;
    public RightKey(Tank tank)
    {
        this.tank = tank;
    }

    public void execute()
    {
        int actorX = this.tank.getX();
        int actorY = this.tank.getY();
        int x_offset;
        int y_offset;
        if(last_shot == -1 || System.nanoTime() - last_shot >= bullet_interval) {
            if(tank.getRotation() == 0){
                tank.turn(90);
            }
            else{
                tank.turn(90);
            }
            last_shot = System.nanoTime();
            System.out.println("Rot "+tank.getRotation());
        }
    }
}
