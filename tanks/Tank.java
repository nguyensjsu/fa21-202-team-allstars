import greenfoot.Actor;

/**
 * Write a description of class Tank here.
 * 
 * @author Guru Karthik
 * @version 11/23/2021
 */
public abstract class Tank extends Actor
{
    private int health;
     static long bullet_interval = 200000000;
    static final int bullet_offset = 40;
    long last_shot = -1;
    
    Health1Strategy health1 = new Health1Strategy(); 
    IBulletCollisionStrategy health0 = new Health0Strategy(); 
    IBulletCollisionStrategy strategy = health1; 
    public Tank()
    {
        health = 3;
    }
    
    public void shoot(){
        if(last_shot == -1 || System.nanoTime() - last_shot >= bullet_interval) {
            Bullet bullet = new Bullet();
            int x_offset;
            int y_offset;
            int rotation = getRotation();
            
            if(rotation == 0) {
                x_offset = bullet_offset;
                y_offset = 0;
            }else if(rotation == 90) {
                x_offset = 0;
                y_offset = bullet_offset;
            }else if(rotation == 180) {
                x_offset = -bullet_offset;
                y_offset = 0;
            }else{
                x_offset = 0;
                y_offset = -bullet_offset;
            }
            bullet.setRotation(rotation);
            getWorld().addObject(bullet, getX() + x_offset, getY() + y_offset);
            
            last_shot = System.nanoTime();
        }
    }
    public void turnLeft(){
        
    }
    public void turnRight(){
        
    }
    public void moveStraight(){
        
    }
    public void moveDown(){
        
    }
    public void reduceHealth(){
        health--;
    }
    public int getHealth() {
        return health;
    }
    //public abstract UnmovableObjects getObstacle(String direction);
    
    public UnmovableObjects getObstacle(String direction){
        int actorX = getX();
        int actorY = getY();
        UnmovableObjects a = null;
        int x_offset;
        int y_offset;
        int rotation = getRotation();    
        switch (direction) {
            case "up":
                    
                if(rotation == 0) {
                    a = (UnmovableObjects)getOneObjectAtOffset(25, 0, UnmovableObjects.class);
                }else if(rotation == 90) {
                    a = (UnmovableObjects)getOneObjectAtOffset(0, 25, UnmovableObjects.class);
                }else if(rotation == 180) {
                    a = (UnmovableObjects)getOneObjectAtOffset(-25, 0, UnmovableObjects.class);
                }else{
                    a = (UnmovableObjects)getOneObjectAtOffset(0, -25, UnmovableObjects.class);
                }
                break;
            case "down":    
                if(rotation == 0) {
                    a = (UnmovableObjects)getOneObjectAtOffset(-25, 0, UnmovableObjects.class);
                }else if(rotation == 90) {
                    a = (UnmovableObjects)getOneObjectAtOffset(0, -25, UnmovableObjects.class);
                }else if(rotation == 180) {
                    a = (UnmovableObjects)getOneObjectAtOffset(25, 0, UnmovableObjects.class);
                }else{
                    a = (UnmovableObjects)getOneObjectAtOffset(0, 25, UnmovableObjects.class);
                }
                break;
        }
        return a;
    }
    
    public void bulletCollision() {
        reduceHealth();
        if(getHealth() == 0){
            strategy = health0;
        }
        strategy.display(this) ;
    }
}
