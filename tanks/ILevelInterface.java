import greenfoot.World;

/**
 * LevelOne
 */
public interface ILevelInterface{
    public void createLevel();
    void setWorld(World dec);

    int[][] getCurrentTankStatus(); // [[p1Lives, p1Health],[p2Lives, p2Health], [AITanksLeft, CurrentAITanks]] 
    
    void act();
}