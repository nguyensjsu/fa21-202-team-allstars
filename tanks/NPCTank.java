import greenfoot.*;

public class NPCTank extends Tank implements NPCTankBrainObserverInterface{
    private NPCTankBrainInterface brain;
    private String nextAction;
    private TankCommands upKey;
    private TankCommands leftKey;
    private TankCommands rightKey;
    private TankCommands downKey;
    private static final int lineOfSightDistance=5;
    
    public NPCTank(){
        this.brain=new NPCTankBrain();
        this.brain.attachObserver(this);
        upKey = new UpKey(this);
        leftKey = new LeftKey(this);
        rightKey = new RightKey(this);
        downKey = new DownKey(this);
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 45, image.getHeight() - 15);
        setImage(image);
    }
    
    public void act(){
        if(this.health<=0){
            this.brain.zeroHealth();
        }
        this.senseEnviron();
        this.executeAction();
    }
    private void senseEnviron(){
        processSight(lookAhead(this.lineOfSightDistance));
    }
    private void processSight(Actor sight){
        if(sight==null){
            this.brain.seeNothing();
        }
        else{
            String sightString=sight.getClass().toString().substring(6);
            if(sightString.equals("P1Tank")){
                this.brain.seeEnemy();
            }
            else if(sightString.equals("P2Tank")){
                this.brain.seeEnemy();
            }
            else if(sightString.equals("NPCTank")){
                this.brain.seeFriend();
            }
            else if(sightString.equals("Brick")){
                this.brain.seeWall();
            }
            else{
                this.brain.seeNothing();
            }
        }
    }
    
    public void reduceHealth(){
        this.health--;
        this.brain.takeDamage();
    }
    
    
    private void executeAction(){
        if(this.nextAction.equals("DamagedState")){
            //
        }
        else if(this.nextAction.equals("DefeatState")){
            //
        }
        else if(this.nextAction.equals("DriveBackwardState")){
            downKey.execute();
        }
        else if(this.nextAction.equals("DriveForwardState")){
            upKey.execute();
        }
        else if(this.nextAction.equals("RestState")){
            //
        }
        else if(this.nextAction.equals("TurnLeftState")){
            leftKey.execute();
        }
        else if(this.nextAction.equals("ShootState")){
            this.shoot();
        }
        else if(this.nextAction.equals("TurnRightState")){
            rightKey.execute();
        }
    }
    public void update(NPCTankBrainInterface observed){
        this.nextAction=observed.getState().getClass().toString().substring(6);
    }
    private Actor lookAhead(int distance){
        int increment=25;
        int rot=getRotation();
        int n=1;
        Actor result=null;
        while(result==null&&n<=distance){
            if(rot==0){
                result=lookAheadRot0(distance,increment);
            }
            else if(rot==90){
                result=lookAheadRot90(distance,increment);
            }
            else if(rot==180){
                result=lookAheadRot180(distance,increment);
            }
            else if(rot==270){
                result=lookAheadRot270(distance,increment);
            }
            n++;
        }
        return result;
    }
    private Actor lookAheadRot0(int distance,int increment){
        Actor result=null;
        result=getOneObjectAtOffset(increment*distance,0,null);
        return result;
    }
    private Actor lookAheadRot90(int distance,int increment){
        Actor result=null;
        result=getOneObjectAtOffset(0,increment*distance,null);
        return result;
    }
    private Actor lookAheadRot180(int distance,int increment){
        Actor result=null;
        result=getOneObjectAtOffset(-increment*distance,0,null);
        return result;
    }
    private Actor lookAheadRot270(int distance,int increment){
        Actor result=null;
        result=getOneObjectAtOffset(0,-increment*distance,null);
        return result;
    }
}