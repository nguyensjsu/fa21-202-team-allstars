/**
 * Write a description of class P1TankDecorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P1TankDecorator extends TankDecorator
{
    public P1TankDecorator(AbstractTank tank) {
        super(tank);
        base.setImage("car01-n.png");
    }
    
    public void act() {
        
    }
}
