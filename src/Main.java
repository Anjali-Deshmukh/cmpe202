import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Creating possible list of coins for gumball Machine

        List<Integer> onlyQuarterMachineCoinsList = new ArrayList<Integer>();
        onlyQuarterMachineCoinsList.add(25);
        List<Integer> twoQuarterMachineCoinsList = new ArrayList<Integer>();
        twoQuarterMachineCoinsList.add(25);
        List<Integer> allCoinMachineCoinsList = new ArrayList<Integer>();
        allCoinMachineCoinsList.add(5); //Nickel
        allCoinMachineCoinsList.add(10); //Dime
        allCoinMachineCoinsList.add(25); //Quarter


        //Declaring Gumball machine accepting only quarters
        GumballMachine onlyQuarterMachine = new GumballMachine(20, 25, onlyQuarterMachineCoinsList);

        //Declaring Gumball machine accepting two quarters
        GumballMachine twoQuarterMachine = new GumballMachine(20, 50, onlyQuarterMachineCoinsList);

        //Declaring Gumball machine accepting all coins
        GumballMachine allCoinMachine = new GumballMachine(20, 50, onlyQuarterMachineCoinsList);

        System.out.println("Trying on the single Quarater Machine");
        System.out.println(onlyQuarterMachine);
        onlyQuarterMachine.insertCoin(25);
        onlyQuarterMachine.turnCrank();
        System.out.println(onlyQuarterMachine);

        System.out.println("Trying on the two Quarater Machine");
        System.out.println(twoQuarterMachine);
        twoQuarterMachine.insertCoin(5);
        twoQuarterMachine.turnCrank();
        twoQuarterMachine.insertCoin(25);
        twoQuarterMachine.insertCoin(25);
        twoQuarterMachine.insertCoin(25);
        twoQuarterMachine.turnCrank();
        System.out.println(twoQuarterMachine);

        System.out.println("Trying on the Machine accepting all coins");
        System.out.println(onlyQuarterMachine);
        onlyQuarterMachine.insertCoin(25);
        onlyQuarterMachine.turnCrank();
        System.out.println(onlyQuarterMachine);

    }
}