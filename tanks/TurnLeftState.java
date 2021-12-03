public class TurnLeftState extends NullState{
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
        int roll=rng.nextInt(100);
        if(roll<50){
            this.stateMachine.setToDriveForwardState();
        }
        else if(roll<100){
            this.stateMachine.setToTurnLeftState();
        }
    }
    public void seeWall(){
        int roll=rng.nextInt(100);
        if(roll<25){
            this.stateMachine.setToDriveBackwardState();
        }
        else if(roll<75){
            this.stateMachine.setToTurnLeftState();
        }
        else if(roll<100){
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