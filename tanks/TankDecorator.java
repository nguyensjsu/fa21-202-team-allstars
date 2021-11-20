/**
 * Write a description of class TankDecorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class TankDecorator  extends AbstractTank
{
    AbstractTank base;
    public TankDecorator(AbstractTank tank) {
        base = tank;
    }
    
    public void shoot() {
        if(base != null)
            base.shoot();
    }
}
