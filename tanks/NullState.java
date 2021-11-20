public abstract class NullState implements NPCTankBrainStateInterface{
    protected NPCTankBrainInterface stateMachine;
    public void setStateMachine(NPCTankBrainInterface stateMachine){
        this.stateMachine=stateMachine;
    }
}