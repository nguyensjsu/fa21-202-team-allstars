import java.util.Arrays;
import java.util.Random;
import greenfoot.*;
import java.util.List;

public class LevelHandler {

    static boolean[] tankCordinatesAvaliability = {true, true, true, true, true, true};
    final static int totalLocations = 5;
    static int[][] tankCordinates={{125,25},{675,275},{375,25},{25,475},{675,475},{275,425}};
    static final int AI_TANK_LIMIT_ON_SCREEN = 3;
    
    static final int AI_TANK_TOTAL = 10;
    
    static final int PLAYER_DEAFULT_LIVES = 3;
    static final int PLAYER_DEAFULT_HEALTH = 3;

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
    
    public void run() {
        World world = decorator.returnWorld();
        List<P1Tank> p1Tank = world.getObjects(P1Tank.class);
        List<P2Tank> p2Tank = world.getObjects(P2Tank.class);
        List<NPCTank> npcs = world.getObjects(NPCTank.class);
        
        //checking endgame
        if((p1Tank.isEmpty() && p2Tank.isEmpty()) || npcs.isEmpty()) {
            int[][] stats = getCurrentTankStatus();
            int score = 0;
            score += stats[0][0] * 10 + stats[0][1] * 2;
            score += stats[1][0] * 10 + stats[1][1] * 2;
            score += (AITanksCreated - currentAITankCount) * 5; // 5points per tank
            //System.out.println("Score: " + score);
            EndGame end = new EndGame();
            Greenfoot.setWorld(end);
        }
        
        
        if(!p1Tank.isEmpty()) {
            P1Tank p1 = p1Tank.get(0);
            playerOneHealth = p1.getHealth();
            if(playerOneHealth <= 0) {
                world.removeObject(p1);
                if(playerOneLives > 0) {
                    newPlayerTank(new P1Tank());
                    playerOneLives--;
                }
            }
        }
        
        if(!p2Tank.isEmpty()) {
            P2Tank p2 = p2Tank.get(0);
            playerTwoHealth = p2.getHealth();
            if(playerTwoHealth <= 0) {
                world.removeObject(p2);
                if(playerTwoLives > 0) {
                    newPlayerTank(new P2Tank());
                    playerTwoLives--;
                }
            }
        }
        
        for(NPCTank npc: npcs){
            if(npc.getHealth() == 0) {
                world.removeObject(npc);
                currentAITankCount--;
            }
        }
        
        int aiTanksToAdd = AI_TANK_TOTAL - AITanksCreated;
        aiTanksToAdd = (aiTanksToAdd > AI_TANK_LIMIT_ON_SCREEN) ? AI_TANK_LIMIT_ON_SCREEN : aiTanksToAdd;
        for(int i=0; i<aiTanksToAdd; i++){
            newEnemyTank();
        }
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
    
    public void newPlayerTank(Tank tank) {
        Random ran = new Random();
        int locationIndex = ran.nextInt(totalLocations);
        while(!tankCordinatesAvaliability[locationIndex]){
            locationIndex = ran.nextInt(totalLocations);
        }
        int[] location = tankCordinates[locationIndex];
        tankCordinatesAvaliability[locationIndex] = false;
        decorator.addObject(tank, location[0], location[1]);
        tankCordinatesAvaliability[locationIndex] = true;
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
    }
    
    public void reset(){
        levelHandler = null;
    }
}
