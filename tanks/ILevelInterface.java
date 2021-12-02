import greenfoot.World;

/**
 * LevelOne
 */
public interface ILevelInterface{
    public void createLevel();
    void setWorld(World dec);
     // As of now No Sheild
    boolean isPlayerOneALive();
    boolean isPlayerTwoALive();

    int getPlayerOneLives();
    int getPlayerTwoLives();

    void decreasePlayerOneHealth(int damage);
    void decreasePlayerTwoHealth(int damage);

    public void moveToNextLevel();

    int[][] getCurrentTankStatus(); // [[p1Lives, p1Health],[p2Lives, p2Health], [AITanksLeft, CurrentAITanks]] 
}