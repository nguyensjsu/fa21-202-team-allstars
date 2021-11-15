import java.util.Random;
import greenfoot.*;

public class LevelTwo extends World implements ILevelInterface {

    private LevelHandler levelHandler;

    private World nextLevel;

    static int[][] tankCordinates={{25,325},{425,575},{375,25},{675,225}};

    public LevelTwo(){
        super(700,600,1);
        createLevel();
    }
    
    public void createLevel(){
        levelHandler = new LevelHandler();
        createBricks();
        newEnemyTank();
    }
    
    public void newEnemyTank(){
        Random ran = new Random();
        int x = ran.nextInt(tankCordinates.length);
        Tank tank =new Tank();
        int[] location = tankCordinates[x];
        addObject(tank, location[0], location[1]);
        levelHandler.AITankCreated();
    }

    public void moveToNextLevel(){
        if(nextLevel != null)
            Greenfoot.setWorld(nextLevel);
    }


    public boolean isPlayerOneALive() {
        return levelHandler.isPlayerOneALive();   
    }
    public boolean isPlayerTwoALive() {
       return levelHandler.isPlayerTwoALive();   
    }

    public int getPlayerOneLives() {
        return levelHandler.getPlayerOneLives();
    }
    public int getPlayerTwoLives() {
        return levelHandler.getPlayerTwoLives();
    }

    public void decreasePlayerOneHealth(int damage) {
        levelHandler.decreasePlayerOneHealth(damage);
    }
    public void decreasePlayerTwoHealth(int damage) {
        levelHandler.decreasePlayerTwoHealth(damage);
    }

    public int[][] getCurrentTankStatus(){
        return levelHandler.getCurrentTankStatus();
    }

    public void createBricks() {
    }

    
}
