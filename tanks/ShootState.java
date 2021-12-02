public class ShootState extends NullState{
    public ShootState(){
        super();
    }
    public ShootState(NPCTankBrainInterface stateMachine){
        super(stateMachine);
    }
    public void seeEnemy(){
        this.stateMachine.setToRestState();
    }
    public void seeFriend(){
        this.stateMachine.setToRestState();
    }
    public void seeNothing(){
        this.stateMachine.setToRestState();
    }
    public void seeWall(){
        this.stateMachine.setToRestState();
    }
    public void takeDamage(){
        this.stateMachine.setToDamagedState();
    }
    public void zeroHealth(){
        this.stateMachine.setToDefeatState();
    }
}