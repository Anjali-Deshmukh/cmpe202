public class Main {
    public static void main(String[] args) {
        /* 1 Quarter Machine */
        GumballMachine_1Quarter gumballMachine_1Quarter = new GumballMachine_1Quarter(5);

        gumballMachine_1Quarter.insertQuarter(25);
        gumballMachine_1Quarter.turnCrank();

        gumballMachine_1Quarter.insertQuarter(25);
        gumballMachine_1Quarter.turnCrank();
        gumballMachine_1Quarter.insertQuarter(25);
        gumballMachine_1Quarter.turnCrank();

        /* 2 Quarter Machine */
        GumballMachine_2Quarters gumballMachine_2Quarters = new GumballMachine_2Quarters(5);

        gumballMachine_2Quarters.insertQuarter(25);
        gumballMachine_2Quarters.turnCrank();

        gumballMachine_2Quarters.insertQuarter(25);
        gumballMachine_2Quarters.turnCrank();
        gumballMachine_2Quarters.insertQuarter(25);
        gumballMachine_2Quarters.turnCrank();

        /* All coins Machine */
        GumballMachine_AllCoins gumballMachine_AllCoins = new GumballMachine_AllCoins(5);

        gumballMachine_AllCoins.insertCoin(10);
        gumballMachine_AllCoins.turnCrank();

        gumballMachine_AllCoins.insertCoin(25);
        gumballMachine_AllCoins.turnCrank();
        gumballMachine_AllCoins.insertCoin(25);
        gumballMachine_AllCoins.turnCrank();
    }
}

