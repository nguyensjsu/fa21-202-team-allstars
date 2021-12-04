# Week 1

I was assigned to design levels for the game. Created LevelOne and LevelTwo, both classes implement LevelInterface. Sachin defined Brick and Unbreakable classes. Based on these classes, build only LevelOne layout to make sure the setup works well first.

Blockers : None

# Week 2

Previous Work : Basic LevelOne layout created and displayed bricks in the LevelOne.

Things to do : Sachin implements LevelDecorator to display player health and lives. Need to make changes accordingly in the LevelOne class. Define the methods to create tank objects and send players status to the decorator. LevelHandler is implemented using Singleton Design pattern.

Blockers : The functionality that handels players health is not yet handled so LevelHandler sending only static values to decorator. Yash doesn't created main menu that blocking creating LevelBuilder.

# Week 3

Previous Work : Created LevelOne and showing static players status values on the decorator. LevelHandler created medthods to maintain players status and AITanks.

Things to do : Create a LevelBuilder class that takes any ILevelInterface object and binds with LevelDecorator and then constructs the level. It implements strategy pattern. Build LevelTwo, used unbreakable bricks in LevelTwo.

Blockers : The functionality that handels players health is not yet handled so LevelHandler sending only static values to decorator.

# Week 4

Previous Work : Defined LevelTwo and created LevelBuilder class that creates Levels. 

Things to do: Update actual status values of the players. Remove AITanks once their health becomes zero. Once, game is over, display Score of the players and show the Exit Page. Return to the home page when the user clicks the exit button.

Blockers : None

