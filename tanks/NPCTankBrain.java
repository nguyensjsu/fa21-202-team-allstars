import java.util.ArrayList;
public class NPCTankBrain implements NPCTankBrainInterface{
    private AggroState aggro;
    private DamagedState damaged;
    private DefeatState defeat;
    private FleeState flee;
    private RestState rest;
    private SearchState search;
    private ShootState shoot;
    private WanderState wander;
    private NPCTankBrainStateInterface currentState;
    private ArrayList<NPCTankBrainObserverInterface> observers;
    public NPCTankBrain(){
        this.aggro=new AggroState();
        this.aggro.setStateMachine(this);
        this.damaged=new DamagedState();
        this.damaged.setStateMachine(this);
        this.defeat=new DefeatState();
        this.defeat.setStateMachine(this);
        this.flee=new FleeState();
        this.flee.setStateMachine(this);
        this.rest=new RestState();
        this.rest.setStateMachine(this);
        this.search=new SearchState();
        this.search.setStateMachine(this);
        this.shoot=new ShootState();
        this.shoot.setStateMachine(this);
        this.wander=new WanderState();
        this.wander.setStateMachine(this);
        this.setToRestState();
    }
    //handling observers
    public void attachObserver(NPCTankBrainObserverInterface newObserver){
        observers.add(newObserver);
    }
    public void notifyObservers(){
        for(int i=0;i<observers.size();i++){
            observers.get(i).update(this);
        }
    }
    //handling events
    public void hitEnemy(){
        this.currentState.hitEnemy();
    }
    public void seeEnemy(){
        this.currentState.seeEnemy();
    }
    public void seeFriend(){
        this.currentState.seeFriend();
    }
    public void seeNothing(){
        this.currentState.seeNothing();
    }
    public void takeDamage(){
        this.currentState.takeDamage();
    }
    public void zeroHealth(){
        this.currentState.zeroHealth();
    }
    //handling states
    public NPCTankBrainStateInterface getState(){
        return this.currentState;
    }
    public void setToAggroState(){
        this.currentState=this.aggro;
        this.notifyObservers();
    }
    public void setToDamagedState(){
        this.currentState=this.damaged;
        this.notifyObservers();
    }
    public void setToDefeatState(){
        this.currentState=this.defeat;
        this.notifyObservers();
    }
    public void setToFleeState(){
        this.currentState=this.flee;
        this.notifyObservers();
    }
    public void setToRestState(){
        this.currentState=this.rest;
        this.notifyObservers();
    }
    public void setToSearchState(){
        this.currentState=this.search;
        this.notifyObservers();
    }
    public void setToShootState(){
        this.currentState=this.shoot;
        this.notifyObservers();
    }
    public void setToWanderState(){
        this.currentState=this.wander;
        this.notifyObservers();
    }
}