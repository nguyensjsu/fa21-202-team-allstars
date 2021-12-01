import greenfoot.*;

public class NPCTank extends Tank implements NPCTankBrainObserverInterface{
    private NPCTankBrainInterface brain;
    private String nextAction;
    private TankCommands upKey;
    private TankCommands leftKey;
    private TankCommands rightKey;
    private TankCommands downKey;
    
    public NPCTank(){
        upKey = new UpKey(this);
        leftKey = new LeftKey(this);
        rightKey = new RightKey(this);
        downKey = new DownKey(this);
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 45, image.getHeight() - 15);
        setImage(image);
    }
    
    public void act(){
        //use getOneObjectAtOffset to "look ahead" n spaces and tell brain what you see
        if(this.nextAction=="DamagedState"){
            //
        }
        else if(this.nextAction=="DefeatState"){
            //
        }
        else if(this.nextAction=="DriveBackwardState"){
            downKey.execute();
        }
        else if(this.nextAction=="DriveForwardState"){
            upKey.execute();
        }
        else if(this.nextAction=="RestState"){
            //
        }
        else if(this.nextAction=="TurnLeftState"){
            leftKey.execute();
        }
        else if(this.nextAction=="ShootState"){
            this.shoot();
        }
        else if(this.nextAction=="TurnRightState"){
            rightKey.execute();
        }
    }
    public void update(NPCTankBrainInterface observed){
        this.nextAction=observed.getState().getClass().toString();
    }
}