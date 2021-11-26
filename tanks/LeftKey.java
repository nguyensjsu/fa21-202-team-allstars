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
    long bullet_interval = 200000000;
    long last_shot = -1;
    public LeftKey(Tank tank)
    {
        this.tank = tank;
    }

    public void execute()
    {
        int x_offset;
        int y_offset;
        if(last_shot == -1 || System.nanoTime() - last_shot >= bullet_interval) {
            if(tank.getRotation() == 0){
                tank.turn(270);
            }
            else{
                tank.turn(-90);
            }
            last_shot = System.nanoTime();
            System.out.println("Rot "+tank.getRotation());
        }
    }
}
