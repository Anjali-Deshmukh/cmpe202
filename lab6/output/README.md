Output

Printing Order Receipt 
{{{{ BACON }}}}
LETTUCE
TOMATO
->G ONION
->JALA GRILLED


Printing Packing order 
LETTUCE
TOMATO
->G ONION
->JALA GRILLED
{{{{ BACON }}}}



Process finished with exit code 0

Describe how the design pattern you've implemented in your Solution.
I have use strategy pattern to implement this printing solution. 
There are two types in which the printing is being done. 
1. Printing order Receipt: Printing in order of customer inputs
2. Printing Packing order: Printing in order of assemly of the burger

I created an Interface named 'PrintStrategy', implemented this inteface in two classes 
1. PrintReceipt: Depicting printing procedure for Printing order Receipt
2. PrintPacking: Depicting printing procedure for Printing Packing order

Associated PrintStrategy interface with context order. 
Now I could use generic method "order.getStrategy().printOrder(order)" to print any kind of order.



