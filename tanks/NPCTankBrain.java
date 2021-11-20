public class NPCTankBrain implements NPCTankBrainInterface{
    private AggroState aggro;
    private FleeState flee;
    private RestState rest;
    private SearchState search;
    private ShootState shoot;
    private WanderState wander;
    private NPCTankBrainStateInterface currentState;
    public NPCTankBrain(){
        this.aggro=new AggroState();
        this.aggro.setStateMachine(this);
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
    //events
    public void hitEnemy(){
        this.currentState.hitEnemy();
    }
    public void seeEnemy(){
        this.currentState.seeEnemy();
    }
    public void seeFriend(){
        this.currentState.seeFriend();
    }
    public void takeDamage(){
        this.currentState.takeDamage();
    }
    //statechanges
    public void setToAggroState(){
        this.currentState=this.aggro;
    }
    public void setToFleeState(){
        this.currentState=this.flee;
    }
    public void setToRestState(){
        this.currentState=this.rest;
    }
    public void setToSearchState(){
        this.currentState=this.search;
    }
    public void setToShootState(){
        this.currentState=this.shoot;
    }
    public void setToWanderState(){
        this.currentState=this.wander;
    }
}