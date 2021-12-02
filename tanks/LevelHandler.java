import java.util.Arrays;
import java.util.Random;
import greenfoot.*;
public class LevelHandler {

    static boolean[] tankCordinatesAvaliability = {true, true, true, true, true, true};
    final static int totalLocations = 5;
    static int[][] tankCordinates={{125,25},{675,275},{375,25},{25,475},{675,475},{275,425}};
    static final int AI_TANK_LIMIT_ON_SCREEN = 3;
    
    static final int AI_TANK_TOTAL = 10;
    
    static final int PLAYER_DEAFULT_LIVES = 3;
    static final int PLAYER_DEAFULT_HEALTH = 100;

    private int playerOneLives;
    private int playerTwoLives;

    private int playerOneHealth;
    private int playerTwoHealth;

    private boolean playerOneALive;
    private boolean playerTwoALive;

    private int currentAITankCount = 0;
    private int AITanksCreated = 0;
    private LevelDecorator decorator;
    
    private static LevelHandler levelHandler= null;
    
    public static LevelHandler getNewInstance(){
        levelHandler =  new LevelHandler();
        return levelHandler;
    }
    
    public void setDecorator(LevelDecorator decorator){
        this.decorator = decorator;
    }
    
    public static LevelHandler getInstance(){
        if(levelHandler == null)
            return getNewInstance();
        return levelHandler;
    }

    public LevelHandler(){
        playerOneLives = PLAYER_DEAFULT_LIVES;
        playerTwoLives = PLAYER_DEAFULT_LIVES;
        playerOneHealth = PLAYER_DEAFULT_HEALTH;
        playerTwoHealth = PLAYER_DEAFULT_HEALTH;
        playerOneALive = true;
        playerTwoALive = true;
    }
    
    public void createEnemyTanks(){
        for(int i=0; i<AI_TANK_LIMIT_ON_SCREEN;i++){
            newEnemyTank();
        }
    }

    public void newEnemyTank(){
        if(isCreatingAIPossible()){
            Random ran = new Random();
            NPCTank aiTank = new NPCTank();
            int locationIndex =ran.nextInt(totalLocations);
            while(!tankCordinatesAvaliability[locationIndex]){
                locationIndex = ran.nextInt(totalLocations);
            }
            int[] location = tankCordinates[locationIndex];
            tankCordinatesAvaliability[locationIndex] = false;
            decorator.addObject(aiTank, location[0], location[1]);
            tankCordinatesAvaliability[locationIndex] = true;
            AITankCreated();
        }
    }
    
    public boolean isPlayerOneALive() {
        return this.playerOneALive;   
    }
    public boolean isPlayerTwoALive() {
       return this.playerTwoALive;   
    }

    public int getPlayerOneLives() {
        return this.playerOneLives;
    }
    public int getPlayerTwoLives() {
        return this.playerTwoLives;
    }

    public void decreasePlayerOneHealth(int damage) {
        this.playerOneHealth -= damage;
        if(this.playerOneHealth <= 0){
            this.playerOneLives--;
            playerOneHealth = PLAYER_DEAFULT_HEALTH;
            if(this.playerOneLives == 0)
                playerOneALive= false;
        }
    }
    public void decreasePlayerTwoHealth(int damage) {
        this.playerTwoHealth -= damage;
        if(this.playerTwoHealth <= 0){
            this.playerTwoLives--;
            playerTwoHealth = PLAYER_DEAFULT_HEALTH;
            if(this.playerTwoLives == 0)
                playerTwoALive= false;
        }
    }

    public int[][] getCurrentTankStatus(){
        int[][] status = new int[3][2];
        status[0] = getPlayerOneStatus();
        status[1] = getPlayerTwoStatus();
        status[2] = getAITankStatus();
        return status; 
    }

    private int[] getAITankStatus() {
        int[] AITankStatus = {AI_TANK_TOTAL - this.AITanksCreated, this.currentAITankCount};
        return AITankStatus;
    }

    private int[] getPlayerOneStatus(){
        int[] playerOneStatus = {this.playerOneLives, this.playerOneHealth};
        return playerOneStatus;
    }
    private int[] getPlayerTwoStatus(){
        int[] playerTwoStatus = {this.playerTwoLives, this.playerTwoHealth};
        return playerTwoStatus;
    }

    public void AITankCreated(){
        this.AITanksCreated++;
        this.currentAITankCount++;
    }
    
    public boolean isCreatingAIPossible(){
        if(AITanksCreated >= AI_TANK_TOTAL)
            return false;
        return true;
    }
    
    public void AITankDestroyed(){
        this.currentAITankCount--;
        if(this.currentAITankCount==0){
            EndGame endGame = new EndGame();
            Greenfoot.setWorld(endGame);
        }
    }
    
    public void reset(){
        levelHandler = null;
    }
    
}
