import java.util.Random;
import greenfoot.*;

public class LevelOne extends World implements ILevelInterface {

    private LevelHandler levelHandler;

    static int[][] tankCordinates={{25,325},{425,575},{375,25},{675,225}};

    private World nextLevel;

    public LevelOne(){
        super(700, 600, 1);
        createLevel();
    }

    public void createLevel(){
        levelHandler = new LevelHandler();
        createBricks();
        newEnemyTank();
        nextLevel = new LevelTwo();
    }

    public void moveToNextLevel(){
        if(nextLevel != null)
            Greenfoot.setWorld(nextLevel);
    }

    public void newEnemyTank(){
        Random ran = new Random();
        int x = ran.nextInt(tankCordinates.length);
        Tank tank =new Tank();
        int[] location = tankCordinates[x];
        addObject(tank, location[0], location[1]);
        levelHandler.AITankCreated();
    }

    public boolean isPlayerOneALive() {
        return levelHandler.isPlayerOneALive();   
    }
    public boolean isPlayerTwoALive() {
       return levelHandler.isPlayerTwoALive();   
    }

    public int getPlayerOneLives() {
        return levelHandler.getPlayerOneLives();
    }
    public int getPlayerTwoLives() {
        return levelHandler.getPlayerTwoLives();
    }

    public void decreasePlayerOneHealth(int damage) {
        levelHandler.decreasePlayerOneHealth(damage);
    }
    public void decreasePlayerTwoHealth(int damage) {
        levelHandler.decreasePlayerTwoHealth(damage);
    }

    public int[][] getCurrentTankStatus(){
        return levelHandler.getCurrentTankStatus();
    }

    public void createBricks(){
        Brick brick1 = new Brick();
        addObject(brick1,75,25);
        Brick brick2 = new Brick();
        addObject(brick2,75,75);
        Brick brick3 = new Brick();
        addObject(brick3,75,125);
        Brick brick4 = new Brick();
        addObject(brick4,75,175);
        Brick brick5 = new Brick();
        addObject(brick5,75,225);
        Brick brick6 = new Brick();
        addObject(brick6,75,275);
        Brick brick7 = new Brick();
        addObject(brick7,125,275);
        Brick brick8 = new Brick();
        addObject(brick8,175,275);
        Brick brick9 = new Brick();
        addObject(brick9,225,275);
        Brick brick10 = new Brick();
        addObject(brick10,275,275);
        Brick brick11 = new Brick();
        addObject(brick11,325,275);
        Brick brick12 = new Brick();
        addObject(brick12,25,275);

        //Square Bricks for Shield
        Brick brick14 = new Brick();
        addObject(brick14,375,575);
        Brick brick15 = new Brick();
        addObject(brick15,375,525);
        Brick brick16 = new Brick();
        addObject(brick16,425,475);
        Brick brick17 = new Brick();
        addObject(brick17,475,525);
        Brick brick18 = new Brick();
        addObject(brick18,475,575);
        Brick brick19 = new Brick();
        addObject(brick19,375,475);
        Brick brick20 = new Brick();
        addObject(brick20,475,475);

        Brick brick21 = new Brick();
        addObject(brick21,325,225);
        Brick brick22 = new Brick();
        addObject(brick22,325,175);
        Brick brick23 = new Brick();
        addObject(brick23,325,225);
        Brick brick24 = new Brick();
        addObject(brick24,325,175);
        Brick brick25 = new Brick();
        addObject(brick25,325,125);
        Brick brick26 = new Brick();
        addObject(brick26,325,75);
        Brick brick27 = new Brick();
        addObject(brick27,325,25);

        Brick brick28 = new Brick();
        addObject(brick28,125,125);
        Brick brick29 = new Brick();
        addObject(brick29,175,125);
        Brick brick30 = new Brick();
        addObject(brick30,225,125);
        Brick brick31 = new Brick();
        addObject(brick31,275,125);

        Brick brick32 = new Brick();
        addObject(brick32,25,375);
        Brick brick33 = new Brick();
        addObject(brick33,75,375);
        Brick brick34 = new Brick();
        addObject(brick34,125,375);
        Brick brick35 = new Brick();
        addObject(brick35,175,375);
        Brick brick36 = new Brick();
        addObject(brick36,225,375);
        Brick brick37 = new Brick();
        addObject(brick37,275,375);
        Brick brick38 = new Brick();
        addObject(brick38,325,375);
        Brick brick39 = new Brick();
        addObject(brick39,375,375);
        Brick brick40 = new Brick();
        addObject(brick40,425,375);
        Brick brick41 = new Brick();
        addObject(brick41,475,375);
        Brick brick42 = new Brick();
        addObject(brick42,525,375);
        Brick brick43 = new Brick();
        addObject(brick43,575,375);
        Brick brick44 = new Brick();
        addObject(brick44,625,375);
        Brick brick45 = new Brick();
        addObject(brick45,675,375);

        Brick brick46 = new Brick();
        addObject(brick46,125,425);
        Brick brick47 = new Brick();
        addObject(brick47,175,475);
        Brick brick48 = new Brick();
        addObject(brick48,225,525);
        Brick brick49 = new Brick();
        addObject(brick49,275,575);
        Brick brick50 = new Brick();
        addObject(brick50,225,425);
        Brick brick51 = new Brick();
        addObject(brick51,275,475);
        Brick brick52 = new Brick();
        addObject(brick52,325,425);

        Brick brick53 = new Brick();
        addObject(brick53,525,425);
        Brick brick54 = new Brick();
        addObject(brick54,575,475);
        Brick brick55 = new Brick();
        addObject(brick55,625,525);
        Brick brick56 = new Brick();
        addObject(brick56,675,575);
        Brick brick57 = new Brick();
        addObject(brick57,575,575);
        Brick brick58 = new Brick();
        addObject(brick58,525,525);

        Brick brick59 = new Brick();
        addObject(brick59,25,475);
        Brick brick60 = new Brick();
        addObject(brick60,75,525);
        Brick brick61 = new Brick();
        addObject(brick61,125,575);
        Brick brick62 = new Brick();
        addObject(brick62,675,575);
        Brick brick63 = new Brick();
        addObject(brick63,575,575);
        Brick brick64 = new Brick();
        addObject(brick64,525,525);
        Brick brick65 = new Brick();
        addObject(brick65,325,325);

        Brick brick66 = new Brick();
        addObject(brick66,425,225);
        Brick brick67 = new Brick();
        addObject(brick67,475,175);
        Brick brick68 = new Brick();
        addObject(brick68,525,125);
        Brick brick69 = new Brick();
        addObject(brick69,475,75);
        Brick brick70 = new Brick();
        addObject(brick70,425,25);
        Brick brick71 = new Brick();
        addObject(brick71,575,75);
        Brick brick72 = new Brick();
        addObject(brick72,625,25);
        Brick brick73 = new Brick();
        addObject(brick73,675,175);
        Brick brick74 = new Brick();
        addObject(brick74,675,175);
        Brick brick75 = new Brick();
        addObject(brick75,625,225);
        Brick brick76 = new Brick();
        addObject(brick76,575,275);
        Brick brick77 = new Brick();
        addObject(brick77,475,275);
        Brick brick78 = new Brick();
        addObject(brick78,525,275);
        Brick brick79 = new Brick();
        addObject(brick79,625,325);

        Brick brick81 = new Brick();
        addObject(brick81,400,325);
        brick81.setLocation(425,325);
        Brick brick80 = new Brick();
        addObject(brick80,475,275);
        Brick brick = new Brick();
        addObject(brick,625,125);
    }

   
}
