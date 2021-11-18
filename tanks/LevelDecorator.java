import greenfoot.*;
/**
 * Decorates level for adding functionality like number of lives left etc
 * 
 * @Sachin Pothukuchi 
 * @1.0
 */
public class LevelDecorator extends World implements ILevelInterface  
{
    ILevelInterface base;
    public LevelDecorator(ILevelInterface base) {
        super(900, 600, 1);
        this.base = base;
    }
    
    public void setDaddy(World dec) {
        //do nothing
    }
    
    public void createLevel() {
        base.createLevel();
        addBarrier();
        setBackground();
        setImages();
    }
    
    private void setImages() {
        
    }
    
    private void setBackground() {
        GreenfootImage image = getBackground();
        image.setColor(Color.BLUE);
        image.fillRect(700, 0, 200, 600);
    }
    
    private void addBarrier(){
        Barrier barrier = new Barrier();
        addObject(barrier, 700, 300);
    }
    
    public void newEnemyTank() {
        base.newEnemyTank();
    }
    
    public boolean isPlayerOneALive(){
        return base.isPlayerOneALive();
    }
    
    public boolean isPlayerTwoALive(){
        return base.isPlayerTwoALive();
    }
    
    public int getPlayerOneLives(){
        return base.getPlayerOneLives();
    }
    
    public int getPlayerTwoLives(){
        return base.getPlayerTwoLives();
    }
    
    public void decreasePlayerOneHealth(int damage){
        base.decreasePlayerOneHealth(damage);
    }
    
    public void decreasePlayerTwoHealth(int damage){
        base.decreasePlayerTwoHealth(damage);
    }
    
    public void moveToNextLevel(){
        base.moveToNextLevel();
    }
    
    public int[][] getCurrentTankStatus() {
        return base.getCurrentTankStatus();
    }
}
