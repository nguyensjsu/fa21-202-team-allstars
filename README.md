# Team Project (Team Allstars)

## Topic for our Team Project

We decided to make a twin tanks game. For this game we would have 2 players on the same team fighting against a bunch of AI Tanks in the process.

## Links to our project videos

[User Story](https://youtu.be/7N8LDRoHwr8)

[Demo Video](https://youtu.be/0U_06Ww5UJA)

[A Weekly Scrum](https://www.youtube.com/watch?v=5eIIFrw7QuU)

## Team members

[Sachin Pothukuchi](https://github.com/raspuchin)

[Ganesh Tulshibagwale](https://github.com/Ganesh-S-Tulshibagwale)

[Yash Trivedi](https://github.com/yashtrivedi2503)

[Suresh Mula](https://github.com/suresh-mula)

[Mohammed Shafeeq](https://github.com/MdShafeeqU)

[Guru Karthik](https://github.com/gkarthik2)

## Weekly Journals

[Sachin Pothukuchi](https://github.com/nguyensjsu/fa21-202-team-allstars/blob/main/weekly%20journals/Sachin%20Pothukuchi.md)

[Ganesh Tulshibagwale](https://github.com/nguyensjsu/fa21-202-team-allstars/blob/main/weekly%20journals/Ganesh%20Tulshibagwale.md)

[Yash Trivedi](https://github.com/nguyensjsu/fa21-202-team-allstars/blob/main/weekly%20journals/Yash%20Trivedi.md)

[Suresh Mula](https://github.com/nguyensjsu/fa21-202-team-allstars/blob/main/weekly%20journals/Suresh%20Mula.md)

[Mohammed Shafeeq](https://github.com/nguyensjsu/fa21-202-team-allstars/blob/main/weekly%20journals/Mohamed%20Shafeeq.md)

[Guru Karthik](https://github.com/nguyensjsu/fa21-202-team-allstars/blob/main/weekly%20journals/Guru%20Karthik.md)

## XP Core Values and Design Patterns Implemented
| Name                  | XP Core Value |
| :---                  | :---          |
| Suresh Mula           | Communication |
| Yash Trivedi          | Respect       |
| Sachin Pothukuchi     | Simplicity    |
| Mohamed Shafeeq       | Feedback      |
| Ganesh S Tulshibagwale| Simplicity    |
| Guru Karthik          | Courage       |

## Summary of our Project
The project is about a game developed using Greenfoot in java. This game revloves around two player battle tanks fighting against enemy tanks in order to win the game. The tanks have movement controls, rotation controls and shoot functionality. Using these features, the tanks move in any desired direction in search of enemy tanks to find and kill them. Players'  score depends on the respective numebr of enemy tanks damaged or killed. The game ends when either all enemy tanks are destroyed or if both the players' lives are exhausted. The players' high score is then recorded for comparision with subsequent rounds' score.

The game was implemented from scratch, we decided the gameplay and game design by ourselves. For each significant feature the design patterns were chosen appropriately. Any blockers in the project we opened issues to keep track of them and whoever responsible for that component solved the respective issues. Initially we decided to have just two tanks in the game environment, later we decided to have AI tanks in the gameplay. 

Here are a few screenshots

### Main Menu

![Main Menu](https://github.com/nguyensjsu/fa21-202-team-allstars/blob/main/images/mainPage.png?raw=true)


### In A Level

![Level](https://github.com/nguyensjsu/fa21-202-team-allstars/blob/main/images/inALevel.png?raw=true)


### End of Level


![End](https://github.com/nguyensjsu/fa21-202-team-allstars/blob/main/images/EndLevel.png?raw=true)


## High Level Diagrams

### UI WireFrame

![WireFrame](https://github.com/nguyensjsu/fa21-202-team-allstars/blob/main/images/UI%20Wireframe%20Final.png?raw=true)


### Component Diagram

![Component](https://github.com/nguyensjsu/fa21-202-team-allstars/blob/main/images/Component%20Diagram.jpeg?raw=true)



### Class Diagrams For Each of Our Patterns


Decorator (for level) done by Sachin

![Decorator](https://github.com/nguyensjsu/fa21-202-team-allstars/blob/main/images/Class%20Diagram%20Decorator.jpg?raw=true)


StateMachine (for NPC Tank) done by Ganesh

![StateMachine](https://github.com/nguyensjsu/fa21-202-team-allstars/blob/main/images/ClassDiagramTankBrain.png?raw=true)

![StateMachine 2](https://github.com/nguyensjsu/fa21-202-team-allstars/blob/main/images/NPCTankStateTransitionChart.png?raw=true)

The State Machine design pattern is used to control the behavior of the NPCTanks:
- An NPCTank object keeps an NPCTankBrain object as an attribute.
- Every frame, the NPCTank communicates what it senses to the NPCTankBrain, reads an order from the NPCTankBrain, and acts on it.
- The state transition rules are as follows:
  - States cannot transition to their opposite. (for example DriveForward into DriveBackward, or vice versa) If you want to undo what you just did, you should have just stayed still from the start. This I believe was a contributing factor for the early versions' spastic and chaotic movement.
  - Defeat has no transitions, not even self transitions, and all other states transition into Defeat on a zeroHealth event. The NPCTank is dead and about to be deleted
  - All states except Damaged and Defeat transition to Damaged on a takeDamage event. The Damaged state goes to Rest instead, giving already damaged tanks get a grace period before redamaging.
  - All states except Damaged and Shoot transition to Shoot on a seeEnemy event. Those two States transition to Rest instead; the tank is taking a moment to recover
  - All states except Damaged, Shoot, and DriveForward transition to DriveForward on a seeFriend event. Damaged and Shoot go to Rest, and DriveForward usually goes to DriveForward with a chance to go to TurnLeft or Turn Right. I wanted to encourage NPCTanks to travel in packs but give followers a chance to break off and do their own thing too.
  - On a seeWall event, all states exept Damged and Shoot (which both go to Rest) will randomly choose DriveBackward, TurnLeft, TurnRight, or Shoot. The exact weights vary between states, partly because of the above "no opposites" rule and partly to give extra weight to repeating the previous action to avoid jittery chaotic movement. The intended effet is that NPCTanks will avoid obstacles or open fire to clear a path. I included DriveBackward because I liked the idea of the tank backing up to make space for a turn or to get clear of the blast before shooting, even if the action isn't actually necessary.
  - On a seeNothing event, all states except Damaged and Shoot (which both go to Rest) randomly choose DriveBackward, DriveForward, TurnLeft, or TurnRight. Unlike with seeWall, Shoot is unavailable because there is nothing to shoot at. The exact weights vary between states for similar reasons as seeWall. Further, TurnLeft and Turn Right cannot go to DriveBackward. If the tank "wanted" to go in that direction, it would have turned the opposite way and picked DriveForward.

Singleton pattern (for handling level) by Suresh Mula

![LevelHandlerSingletonClassDiagram](https://user-images.githubusercontent.com/89316778/144699945-7925aaa8-6b72-45a2-9780-6f12800abf7c.png)

Strategy Pattern (for Bullet Collision) done by Mohamed Shafeeq

Design Notes:
- Two stragies are set for Bullet collision feature for all the tanks. 
  - Health1Stratgey: After a tank is collided with a bullet, it will get damaged. Therefore, damaged tank is displayed if the health reduces after bullet collision.
  - Health2Strategy: After the health is completely exhausted per life ( i.e. if health becomes zero), the skeleton image is displayed to show that the tank is dead. 
- "IBulletCollisionStrategy" acts as the interface for the strategies. 
- "Heath0Strategy" and "Health1Strategy" are the concrete strategies. 
- Tank class instantiates the "IBulletCollisionStrategy" interface object, using this object the specific strategies are set at respective times.  
- Initially for each tank "Health1Strategy" is assigned.  

![StrategyPattern_ClassDiagram](https://user-images.githubusercontent.com/89361239/144702744-8726ab1f-6003-4812-8e1c-c8edee8adcc6.png)

Singleton Pattern (for Score Management) done by Yash Trivedi

![Twin Tanks Class Diagram](https://user-images.githubusercontent.com/89321789/144721842-fc4b4416-0c23-4784-b412-16f7c8253426.png)

ScoreManager is implemented using Singleton Design pattern. So that it can maintain all scores throughout the session. 
getBestScore() keep track of best score throughout the session.
addScore() adds 5points each time players destroy AI tank
reset() resets the players score after each game
getScore() calculate the score based on the health and lives of the player then added to original score

Command Pattern (for Tank movements, shoot, health features) by Guru Karthik

- Command pattern is used for implementing for tank movement controls

 - Interface used in this pattern is TankCommands which provides method to execute tank movement 
 - The keyboard key event handling classes i.e. UpKey, DownKey, LeftKey, RightKey implement TankCommands and provide their respective implementations for execute method
 - Abstract Class Tank holds references to each of the four key event classes.
 - The Player tank classes and enemy tank classes extend the abstract class Tank and thereby inherit the instances of the four key event classes.
 - Upon press of each direction keys, the command is passed on from the tank class to the respective direction class which shall then trigger the respective movement.

![CommandPattern](https://user-images.githubusercontent.com/89321642/144723466-504f6e0f-ab52-493b-8e0f-fd213f6356d2.png)



## Game Features

1. 2 Levels in the game.
2. 2 Player Game to enjoy with your friend
3. Keeps Track of the Highscore to see if you are improving or not




## Project Backlog and Burndown Chart

Backlog

![Backlog](https://github.com/nguyensjsu/fa21-202-team-allstars/blob/main/images/sprint.PNG)


Burndown Chart

![Burndown](https://github.com/nguyensjsu/fa21-202-team-allstars/blob/main/images/Burndown%20Chart.png?raw=true)
