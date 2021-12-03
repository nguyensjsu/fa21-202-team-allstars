## Week 1

My tasks for weeek 1 were quite simple, I had to create the Bullet, Brick and Unbreakable objects. With these we would have a basic system in place for the level to be created.

Blockers: None


## Week 2

Things done the previous week: Building Bullet, Brick and Unbreakable objects so that Suresh could build the level class and populate it with objects. This way the basic level layout was ready.

Things to do this week: Suresh built the basic level layout last week, now I implement my decorator pattern on the level itself to show the health and lives of tanks on the screen.

Blocker: Tank not yet implemented with a getHealth() function to keep track and display their health. As a result LevelHandler is currently sending only static values to display on the side.


## Week 3

Things done in the previous week: Built a level decorator to display the values of tank life and health. 

Things to do this week: Tank has been implemented with getHealth() function and we can now display those on the sidescreen. Change the color of the sidescreen from blue to gray. Fix bullet launching too close to the tank causing damage in the start itself.

Blockers: LevelHandler is still sending values back to the level that dont change depending on who gets hit, etc.

## Week 4

Things done the previous week: Decorator color change, bullet fix, levelHandler now sending back values based on the current health of respective tanks.

Things to do: Implement respawning of tanks as and when they die. Make end game conditions.

Blockers: None