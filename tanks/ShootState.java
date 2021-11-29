public class ShootState extends NullState{
    //In this state, the tank is momentarily stunned from the recoil of its shot
    //In all events except takeDamage and zeroHealth the tank will go to RestState, causing a 1 timestep delay before the tank reevaluates its actions
    //having seeEnemy go to RestState instead of back into this state gives a grace period for players under fire; the tank has to reload
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