/**
 * Write a description of class ScoreManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreManager  
{
    // instance variables - replace the example below with your own
    private static int score = 0;

    public static int getScore(){
        return score;
    }
    
    public static void addScore(){
        score += 5;
    }
    
    
}
