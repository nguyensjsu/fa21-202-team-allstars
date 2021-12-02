import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        int[][] tankStatus = levelHandler.getCurrentTankStatus();
        int[] player1 = tankStatus[0];
        int[] player2 = tankStatus[1];
        int score = 0;
        score += calculateScore(player1);
        score += calculateScore(player2);
        score += ScoreManager.getScore();
        showText("Score:  "+score, 325,125);
        Exit exit = new Exit();
        addObject(exit, 350, 225);
    }
    public int calculateScore(int[] player){
        int x = player[0]*10;
        int y = player[1]*20;
        return x+y;
    }
}
