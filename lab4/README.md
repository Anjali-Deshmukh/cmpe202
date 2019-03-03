
Design patterns used:

a. **Observer Pattern**
b. **State Pattern**

We would like to have **loose coupling** between 'incoming customer requests' and 'tables addressing the requests'.
To address this we use Observer pattern. The customers are Observers. QueueManager is the Subject/Publisher.

The customers can **subscribe** to QueueManager for the availability of the restaurant table.  While subscribing, customer provides _his/her name, phone number and the party size_. Similarly, customer could **unsubscribe** at any point of time.

QueueManager maintains the **Customer's Priority Queue** based on the order in which the customers are subscribed. Whenever a customer subscribes, it _adds_ customer to the end of the queue. Whenever a customer unsubscribes, it _removes_ it from the queue. It also performs matching of customers to table based on the customer priority and table availability. This matching algorithm could be: there is match when table size is equal to party size. This can be made more complex. If a customer is waiting for long time to get a table match, then allow the customer to sit at table for which table size is larger than party size. Look ahead in the request queue to optimize the wait time for all customers and keep a threadshold for max wait time.

TableManager manages all the tables. It **provides table availability to QueueManager**. It also assigns customers to appropriate table based on QueueManager's decision. It holds list of Tables. Each table has _table capacity, customer id (if there is customer party sitting at the table), table state: FREE, TABLE_ON_HOLD_FOR_CONFIRMED_CUSTOMER, TABLE_IN_USE, TABLE_CLEANING_UP, etc._
For each of the table state transitions, we could use **State Pattern**. When customer confirms reservation table moves from FREE to TABLE_ON_HOLD_FOR_CONFIRMED_CUSTOMER. If customer cancels reservation, it will go back to FREE. When customer is dining at table it will move to TABLE_IN_USE, etc.
