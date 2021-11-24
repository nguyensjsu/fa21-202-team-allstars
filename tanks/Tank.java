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
    private int bullets;
    public Tank()
    {
        health = 10;
        bullets = 100;
    }
    
    public void shoot(){
        bullets--;
    }
    public void turnLeft(){
        
    }
    public void turnRight(){
        
    }
    public void moveStraight(){
        
    }
    public void moveDown(){
        
    }
    public int getBullets(){
        return bullets;
    }
    public void reduceHealth(){
        health--;
    }
    public abstract UnmovableObjects getObstacle(String direction);
}
