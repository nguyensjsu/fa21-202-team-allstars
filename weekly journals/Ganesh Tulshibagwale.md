Week 1:

-Did: Made interfaces and stub classes for the state machine. Sketched out a tentative list of possible state machine events and states

-Will Do: Redefine the list of events once the Tank classes get worked out

-Blockers: What exactly the Tanks will be able to do, what sort of actions they can take, has not been defined yet, so I don't know what states to use or what events make sense

-XP Simplicity: The screenshots of other games we used as inspiration included all sorts of extra mechanics we decided to strip out as irrelevant


Week 2:

-Did: Reorganized class structure a couple of times

-Will Do: Redefine the list of events once the Tank classes get worked out

-Blockers: Like last week, what exactly the Tanks will be able to do, is yet unwritten

-XP Simplicity: Wanted to get the web of inheritances just right so when the time came to write everything I would need to do hardly anything.


Week 3:

-Did: Realized I hadn't made much of a way for the NPCTankBrain to communicate with other parts of the program and added in the necessary interfaces for observer pattern

-Will Do: Finalize events and states and decide how transitions work

-Blockers:

-XP Simplicity:


Week 4:

-Did: My existing list of states was way too focused on high level behaviours (Aggressive/Wandering/Chasing/Fleeing...) that wouldn't actually help defining moment by moment actions, and got replaced by a more granular and specific list (Forward/Backward/Left/Right/Shoot), also started writing the NPCTank class to be an observer of the NPCTankBrain, to demonstrate to Karthik who seemed to be stuck how I expected it to work with my code.

-Will Do:

-Blockers:

-XP Simplicity: I was way too in love with the idea of a super sophisticated intelligent enemy with all sorts of complex behaviour. Reimagining the list made all the work disappear.
