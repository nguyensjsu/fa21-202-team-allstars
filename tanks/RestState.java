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
        //fill in later
        //roll on DriveBackward/DriveForward/TurnLeft/TurnRight/Restx5
        return;
    }
    public void seeWall(){
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