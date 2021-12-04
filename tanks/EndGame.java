import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Displays Exit Page and Player Scores
 * 
 * @Suresh Goud Mula 
 * @1.0
 */
public class EndGame extends World
{

    public EndGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 600, 1);
        showScore();
    }
    
    public void showScore(){
        LevelHandler levelHandler = LevelHandler.getInstance();
        
        int[][] stats = levelHandler.getCurrentTankStatus();
        int score = 0;
        score += stats[0][0] * 10 + stats[0][1] * 2;
        score += stats[1][0] * 10 + stats[1][1] * 2;
        score += (levelHandler.getAITanksCreated() - levelHandler.getCurrentAITankCount()) * 5; // 5points per tank
        
        showText("Score:  "+score, 325,125);
        levelHandler.reset();
        Exit exit = new Exit();
        addObject(exit, 350, 225);
    }
    public int calculateScore(int[] player){
        int x = player[0]*10;
        int y = player[1]*20;
        return x+y;
    }
}
