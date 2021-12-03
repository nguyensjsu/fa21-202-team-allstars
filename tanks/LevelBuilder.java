import greenfoot.Greenfoot;
/**
 * Write a description of class LevelBuilder here.
 * 
 * @SureshGoudMula
 * @version (a version number or a date)
 */
public class LevelBuilder  
{
    private ILevelInterface level;
    
    /**
     * Constructor for objects of class LevelBuilder
     */
    public LevelBuilder(ILevelInterface level)
    {
        this.level = level;
    }

    public void setLevel(ILevelInterface level){
        this.level = level;
    }
    
    public void buildLevel(){
        LevelDecorator levelDecorator = new LevelDecorator(level);
        level.setWorld(levelDecorator);
        LevelHandler levelHandler = LevelHandler.getNewInstance();
        levelHandler.setDecorator(levelDecorator);
        Greenfoot.setWorld(levelDecorator);
        levelDecorator.createLevel();
    }
}
