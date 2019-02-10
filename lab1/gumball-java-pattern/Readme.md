Design Overview
===============
Gumball machine acts as an interface for user to pay and get gumballs. A person can pay variety of coins to get gumballs, and price of the gumball depends on the types of machine you are buying from. Every gumball machine goes through 5 stages representating each state of the gumball machine. The transition of the gumball machine is driven by the operation performed on the gumball machine such as insertCoin, turnCrank. Based on the current state & the operation performed, the next state is decided. Thus, gumball machines moves to it's next state until another operation is performed.

With this design we could easily add any new states to the system with minimal or no impact to existing states or code. This decoupling of behaviors is desired for long term maintenance.

Changes to the existing design
==============================
1. Added state: HasEnoughCoinsState
      This state helps to mark the point where user has inserted enough coins to buy the gumball.
      With this state added, gumball machine can transition to HasNoCoin state to be able to accept coins for further transaction.
2. Used single gumball machine class for all three defined types. To differnciate between the gumball machines added attributes 'validCoins', 'cost', 'count.
3. Added a coin validation method for gumball machines. 
