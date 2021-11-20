public interface NPCTankBrainStateInterface{
    //tentative list of events subject to change
    public default void hitEnemy(){
        return;
    }
    public default void seeEnemy(){
        return;
    }
    public default void seeFriend(){
        return;
    }
    public default void takeDamage(){
        return;
    }
}