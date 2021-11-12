public interface NPCTankBrainInterface extends NPCTankBrainStateInterface{
    //tentative listing of states subject to change
    public void setToAggroState();
    public void setToFleeState();
    public void setToRestState();
    public void setToSearchState();
    public void setToShootState();
    public void setToWanderState();
}