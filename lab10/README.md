## Lab 10
Gumball Machine Problem


# Lab 1 Approach

The common properties in the three machines was num_of_gumballs instance variable and releaseGumball method. So I had encapsulated these in the base class.

Rest of the functionalities varies for each machine, so I had implemented those in the subclasses class.
In this approach sepearte logic had to be written in code to handle all the cases.

# Lab 10 Approach

With the feature Id approach, config file can be used to fit in all crank model as well as slot model.

The code is unscattered and the design is modular.

If any new feature is required, it can be added easily.

![Alt text](/Screenshots/1_Crank_25_1.png?raw=true "25 cents")

![Alt text](/Screenshots/1_Crank_25_2.png?raw=true "25 cents")

![Alt text](/Screenshots/2_Crank_50_1.png?raw=true "50 cents")

![Alt text](/Screenshots/2_Crank_50_2.png?raw=true "50 cents")

![Alt text](/Screenshots/3_Slot_25_1.png?raw=true "25 cents")

![Alt text](/Screenshots/3_Slot_25_2.png?raw=true "25 cents")

![Alt text](/Screenshots/4_Slot_50_1.png?raw=true "50 cents")

![Alt text](/Screenshots/4_Slot_50_2.png?raw=true "50 cents")
