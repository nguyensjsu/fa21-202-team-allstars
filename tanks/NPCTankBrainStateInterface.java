public interface NPCTankBrainStateInterface{
    //tentative list of events subject to change
    public void seeEnemy();
    public void seeFriend();
    public void seeNothing();
    public void seeWall();
    public void takeDamage();
    public void zeroHealth();
}