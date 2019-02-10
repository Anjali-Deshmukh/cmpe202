public class Main {
    public static void main(String[] args) {
        /* 1 Quarter Machine */
        GumballMachine_1Quarter gumballMachine_1Quarter = new GumballMachine_1Quarter(5);

        System.out.println(gumballMachine_1Quarter);

        gumballMachine_1Quarter.insertQuarter( 25 );
        gumballMachine_1Quarter.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine_1Quarter.insertQuarter( 25 );
        gumballMachine_1Quarter.turnCrank();
        gumballMachine_1Quarter.insertQuarter( 25 );
        gumballMachine_1Quarter.turnCrank();

        System.out.println(gumballMachine_1Quarter);


        /* 2 Quarter Machine */
        GumballMachine_2Quarters gumballMachine_2Quarters = new GumballMachine_2Quarters(5);

        System.out.println(gumballMachine_2Quarters);

        gumballMachine_2Quarters.insertQuarter( 25 );
        gumballMachine_2Quarters.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine_2Quarters.insertQuarter( 25 );
        gumballMachine_2Quarters.turnCrank();
        gumballMachine_2Quarters.insertQuarter( 25 );
        gumballMachine_2Quarters.turnCrank();

        System.out.println(gumballMachine_2Quarters);


        /* All coins Machine */
        GumballMachine_AllCoins gumballMachine_AllCoins = new GumballMachine_AllCoins(5);

        System.out.println(gumballMachine_AllCoins);

        gumballMachine_AllCoins.insertCoin( 10);
        gumballMachine_AllCoins.turnCrank();

        System.out.println(gumballMachine_AllCoins);

        gumballMachine_AllCoins.insertCoin( 25 );
        gumballMachine_AllCoins.turnCrank();
        gumballMachine_AllCoins.insertCoin( 25 );
        gumballMachine_AllCoins.turnCrank();

        System.out.println(gumballMachine_AllCoins);

    }

