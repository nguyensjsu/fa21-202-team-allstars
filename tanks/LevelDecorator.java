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
    
    PlaceHolders P1PlaceHolder;
    PlaceHolders P2PlaceHolder;
    PlaceHolders AIPlaceHolder;
    PlaceHolders P1PlaceHolderLives;
    PlaceHolders P2PlaceHolderLives;
    PlaceHolders AIPlaceHolderLives;
    PlaceHolders P1PlaceHolderHealth;
    PlaceHolders P2PlaceHolderHealth;
    PlaceHolders AIPlaceHolderHealth;
    
    public LevelDecorator(ILevelInterface base) {
        super(900, 600, 1);
        this.base = base;
    }
    
    public void setDaddy(World dec) {
        //do nothing
    }
    
    public void act() {
        updateInfo();
    }
    
    public void createLevel() {
        base.createLevel();
        addBarrier();
        setBackground();
        setInfo();
    }
    
    private void setInfo() {     
        
        //temp placeholder dont need reference to these
        PlaceHolders tankHeading = new PlaceHolders();
        tankHeading.updateImage("Tank");
        PlaceHolders livesRemainingHeading = new PlaceHolders();
        livesRemainingHeading.updateImage("Lives");
        PlaceHolders healthRemainingHeading = new PlaceHolders();
        healthRemainingHeading.updateImage("Health");
        
        P1PlaceHolder = new PlaceHolders();
        P1PlaceHolder.setImage(new P1Tank().getImage());
        
        P2PlaceHolder = new PlaceHolders();
        P2PlaceHolder.setImage(new P2Tank().getImage());
        
        AIPlaceHolder = new PlaceHolders();
        AIPlaceHolder.setImage(new NPCTank().getImage());
        
        P1PlaceHolderLives = new PlaceHolders();
        P2PlaceHolderLives = new PlaceHolders();
        AIPlaceHolderLives = new PlaceHolders();
        
        P1PlaceHolderHealth = new PlaceHolders();
        P2PlaceHolderHealth = new PlaceHolders();
        AIPlaceHolderHealth = new PlaceHolders();
        
        
        addObject(tankHeading, 750, 150);
        addObject(livesRemainingHeading, 800, 150);
        addObject(healthRemainingHeading, 850, 150);
        
        addObject(P1PlaceHolder, 750, 200);
        addObject(P1PlaceHolderLives, 800, 200);
        addObject(P1PlaceHolderHealth, 850, 200);
        
        addObject(P2PlaceHolder, 750, 300);
        addObject(P2PlaceHolderLives, 800, 300);
        addObject(P2PlaceHolderHealth, 850, 300);
        
        addObject(AIPlaceHolder, 750, 400);
        addObject(AIPlaceHolderLives, 800, 400);
        addObject(AIPlaceHolderHealth, 850, 400);
    }
    
    public void updateInfo() {
        int[][] stats = getCurrentTankStatus();
        
        P1PlaceHolderLives.updateImage(Integer.toString(stats[0][1]));
        P2PlaceHolderLives.updateImage(Integer.toString(stats[0][1]));
        AIPlaceHolderLives.updateImage(Integer.toString(stats[0][1]));
        
        P1PlaceHolderHealth.updateImage(Integer.toString(stats[0][1]));
        P2PlaceHolderHealth.updateImage(Integer.toString(stats[0][1]));
        AIPlaceHolderHealth.updateImage(Integer.toString(stats[0][1]));
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
