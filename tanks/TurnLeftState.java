public class TurnLeftState extends NullState{
    //In this state, the tank will move about randomly, with a preference for continuing to turn left
    //The tank will fire on enemies, move to follow friends, and has a small chance of shooting at walls
    public TurnLeftState(){
        super();
    }
    public TurnLeftState(NPCTankBrainInterface stateMachine){
        super(stateMachine);
    }
    public void seeEnemy(){
        this.stateMachine.setToShootState();
    }
    public void seeFriend(){
        this.stateMachine.setToDriveForwardState();
    }
    public void seeNothing(){
        int roll=rng.nextInt(12);
        if(roll<2){
            this.stateMachine.setToDriveBackwardState();
        }
        else if(roll<4){
            this.stateMachine.setToDriveForwardState();
        }
        else if(roll<9){
            this.stateMachine.setToTurnLeftState();
        }
        else if(roll<11){
            this.stateMachine.setToTurnRightState();
        }
        else{
            this.stateMachine.setToRestState();
        }
    }
    public void seeWall(){
        int roll=rng.nextInt(17);
        if(roll<3){
            this.stateMachine.setToDriveBackwardState();
        }
        else if(roll<6){
            this.stateMachine.setToDriveForwardState();
        }
        else if(roll<11){
            this.stateMachine.setToTurnLeftState();
        }
        else if(roll<14){
            this.stateMachine.setToTurnRightState();
        }
        else if(roll<16){
            this.stateMachine.setToRestState();
        }
        else{
            this.stateMachine.setToShootState();
        }
    }
    public void takeDamage(){
        this.stateMachine.setToDamagedState();
    }
    public void zeroHealth(){
        this.stateMachine.setToDefeatState();
    }
}