public interface NPCTankBrainInterface extends NPCTankBrainStateInterface{
    //handling observers
    public void attachObserver(NPCTankBrainObserverInterface observer);
    public void notifyObservers();
    //tentative listing of states subject to change
    public void setToAggroState();
    public void setToDamagedState();
    public void setToDefeatState();
    public void setToFleeState();
    public void setToRestState();
    public void setToSearchState();
    public void setToShootState();
    public void setToWanderState();
}