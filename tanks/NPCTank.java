public class NPCTank extends Tank implements NPCTankBrainObserverInterface{
    private NPCTankBrainInterface brain;
    private String nextAction;
    public void act(){
        //use getOneObjectAtOffset to "look ahead" n spaces and tell brain what you see
        if(this.nextAction=="DamagedState"){
            //
        }
        else if(this.nextAction=="DefeatState"){
            //
        }
        else if(this.nextAction=="DriveBackwardState"){
            //
        }
        else if(this.nextAction=="DriveForwardState"){
            //
        }
        else if(this.nextAction=="RestState"){
            //
        }
        else if(this.nextAction=="TurnLeftState"){
            //
        }
        else if(this.nextAction=="ShootState"){
            //
        }
        else if(this.nextAction=="TurnRightState"){
            //
        }
        else if(this.nextAction=="TurnRightState"){
            //
        }
    }
    public void update(NPCTankBrainInterface observed){
        this.nextAction=observed.getState().getClass().toString();
    }
}