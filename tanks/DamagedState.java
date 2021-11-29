public class DamagedState extends NullState{
    //In this state, the tank is momentarily stunned from being struck
    //In all events except zeroHealth the tank will go to RestState, causing a 1 timestep delay before the tank reevaluates its actions
    //having takeDamage go to RestState instead of back into this state gives a grace period before taking further damage
    public DamagedState(){
        super();
    }
    public DamagedState(NPCTankBrainInterface stateMachine){
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
        this.stateMachine.setToRestState();
    }
    public void zeroHealth(){
        this.stateMachine.setToDefeatState();
    }
}