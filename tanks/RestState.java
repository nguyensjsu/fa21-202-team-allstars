public class RestState extends NullState{
    //In this state, the tank will move about randomly, with a preference for staying in place
    //The tank will fire on enemies and move to follow friends
    public RestState(){
        super();
    }
    public RestState(NPCTankBrainInterface stateMachine){
        super(stateMachine);
    }
    public void seeEnemy(){
        this.stateMachine.setToShootState();
    }
    public void seeFriend(){
        this.stateMachine.setToDriveForwardState();
    }
    public void seeNothing(){
        int roll=rng.nextInt(9);
        if(roll<1){
            this.stateMachine.setToDriveBackwardState();
        }
        else if(roll<2){
            this.stateMachine.setToDriveForwardState();
        }
        else if(roll<3){
            this.stateMachine.setToTurnLeftState();
        }
        else if(roll<4){
            this.stateMachine.setToTurnRightState();
        }
        else{
            this.stateMachine.setToRestState();
        }
    }
    public void seeWall(){
        int roll=rng.nextInt(10);
        if(roll<1){
            this.stateMachine.setToDriveBackwardState();
        }
        else if(roll<2){
            this.stateMachine.setToDriveForwardState();
        }
        else if(roll<3){
            this.stateMachine.setToTurnLeftState();
        }
        else if(roll<4){
            this.stateMachine.setToTurnRightState();
        }
        else if(roll<10){
            this.stateMachine.setToRestState();
        }
        else{
            this.stateMachine.setToShootState();
        }
        //fill in later
        //roll on DriveBackward/DriveForward/TurnLeft/TurnRight/Restx5
        return;
    }
    public void takeDamage(){
        this.stateMachine.setToDamagedState();
    }
    public void zeroHealth(){
        this.stateMachine.setToDefeatState();
    }
}