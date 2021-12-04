# Team Project (Team Allstars)

## Topic for our Team Project

We decided to make a twin tanks game. For this game we would have 2 players on the same team fighting against a bunch of AI Tanks in the process.

## Links to our project videos

[User Story](https://youtu.be/7N8LDRoHwr8)

[Demo Video](https://youtu.be/0U_06Ww5UJA)

-- extra credit recording of a scrum meeting?

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

![StateMachine](https://github.com/nguyensjsu/fa21-202-team-allstars/blob/main/images/NPCTankStateTransitionChart.png?raw=true)

![StateMachine 2](https://github.com/nguyensjsu/fa21-202-team-allstars/blob/main/images/ClassDiagramTankBrain.png?raw=true)

Singleton pattern (for handling level) by Suresh Mula

![LevelHandlerSingletonClassDiagram](https://user-images.githubusercontent.com/89316778/144699945-7925aaa8-6b72-45a2-9780-6f12800abf7c.png)

Strategy Pattern (for Bullet Collision) done by Mohamed Shafeeq

![StrategyPattern_ClassDiagram](https://user-images.githubusercontent.com/89361239/144702744-8726ab1f-6003-4812-8e1c-c8edee8adcc6.png)

Singleton Pattern (for Score Management) done by Yash Trivedi

![Twin Tanks Class Diagram](https://user-images.githubusercontent.com/89321789/144721842-fc4b4416-0c23-4784-b412-16f7c8253426.png)

Command Pattern (for Tank movements, shoot, health features) by Guru Karthik

![CommandPattern](https://user-images.githubusercontent.com/89321642/144723466-504f6e0f-ab52-493b-8e0f-fd213f6356d2.png)



## Game Features

1. 2 Levels in the game.
2. 2 Player Game to enjoy with your friend
3. Keeps Track of the Highscore to see if you are improving or not




## Project Backlog and Burndown Chart

Backlog

![Backlog](https://github.com/nguyensjsu/fa21-202-team-allstars/blob/main/images/Sprint%20log.png?raw=true)


Burndown Chart

![Burndown](https://github.com/nguyensjsu/fa21-202-team-allstars/blob/main/images/Burndown%20Chart.png?raw=true)
