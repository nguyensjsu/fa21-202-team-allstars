public abstract class NullState implements NPCTankBrainStateInterface{
    protected NPCTankBrainInterface stateMachine;
    public void setStateMachine(NPCTankBrainInterface stateMachine){
        this.stateMachine=stateMachine;
    }
    public void hitEnemy(){
        return;
    }
    public void seeEnemy(){
        return;
    }
    public void seeFriend(){
        return;
    }
    public void takeDamage(){
        return;
    }
}