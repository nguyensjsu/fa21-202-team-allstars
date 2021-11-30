import greenfoot.*;

/**
 * Write a description of class P1Tank here.
 * 
 * @author Guru Karthik
 * @version 11/23/2021
 */
public class P1Tank extends Tank
{
    private TankCommands upKey;
    private TankCommands leftKey;
    private TankCommands rightKey;
    private TankCommands downKey;
    
    static long bullet_interval = 200000000;
    long last_shot = -1;
    /**
     * Act - do whatever the P1Tank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public P1Tank(){
        upKey = new UpKey(this);
        leftKey = new LeftKey(this);
        rightKey = new RightKey(this);
        downKey = new DownKey(this);
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 45, image.getHeight() - 15);
        setImage(image);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
            leftKey.execute();
        if(Greenfoot.isKeyDown("right"))
            rightKey.execute();
        if(Greenfoot.isKeyDown("up"))
            upKey.execute();
        if(Greenfoot.isKeyDown("down"))
            downKey.execute();
        if(Greenfoot.isKeyDown("space"))
            this.shoot();
    }
    
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
    
    public void shoot(){
        if(last_shot == -1 || System.nanoTime() - last_shot >= bullet_interval) {
            Bullet bullet = new Bullet();
            int x_offset;
            int y_offset;
            int rotation = getRotation();
            
            if(rotation == 0) {
                x_offset = 10;
                y_offset = 0;
            }else if(rotation == 90) {
                x_offset = 0;
                y_offset = 10;
            }else if(rotation == 180) {
                x_offset = -10;
                y_offset = 0;
            }else{
                x_offset = 0;
                y_offset = -10;
            }
            bullet.setRotation(rotation);
            getWorld().addObject(bullet, getX() + x_offset, getY() + y_offset);
            
            last_shot = System.nanoTime();
        }
    }
}
