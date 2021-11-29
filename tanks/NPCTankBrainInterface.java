public interface NPCTankBrainInterface extends NPCTankBrainStateInterface{
    //handling observers
    public void attachObserver(NPCTankBrainObserverInterface observer);
    public void notifyObservers();
    //handling state changes
    public void setToDamagedState();
    public void setToDefeatState();
    public void setToDriveBackwardState();
    public void setToDriveForwardState();
    public void setToRestState();
    public void setToShootState();
    public void setToTurnLeftState();
    public void setToTurnRightState();
}