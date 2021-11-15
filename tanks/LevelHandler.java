public class LevelHandler {

    static final int AI_TANK_LIMIT = 10;
    static final int PLAYER_DEAFULT_LIVES = 3;
    static final int PLAYER_DEAFULT_HEALTH = 100;

    private int playerOneLives;
    private int playerTwoLives;

    private int playerOneHealth;
    private int playerTwoHealth;

    private boolean playerOneALive;
    private boolean playerTwoALive;

    private int currentAITankCount = 0;

    public LevelHandler(){
        playerOneLives = PLAYER_DEAFULT_LIVES;
        playerTwoLives = PLAYER_DEAFULT_LIVES;
        playerOneHealth = PLAYER_DEAFULT_HEALTH;
        playerTwoHealth = PLAYER_DEAFULT_HEALTH;
        playerOneALive = true;
        playerTwoALive = true;
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
        int[] AITankStatus = {AI_TANK_LIMIT - this.currentAITankCount, this.currentAITankCount};
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
        this.currentAITankCount++;
    }
    
}
