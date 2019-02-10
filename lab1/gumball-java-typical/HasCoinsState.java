import java.util.Random;

public class HasCoinsState implements State {
    GumballMachine gumballMachine;

    public HasCoinsState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertCoin(int coin) {
        System.out.println("You inserted a coin " + coin);
        if(!gumballMachine.validateCoin(coin)) {
            System.out.println("This is not a valid coin for this machine");
            System.out.println("Valid coins for this machine are " + gumballMachine.validCoins.toString());
            return;
        }

        gumballMachine.moneyInMachine += coin;
        if(gumballMachine.gumballCost >= gumballMachine.moneyInMachine){
            gumballMachine.setState(gumballMachine.getHasEnoughCoinsState());
            System.out.println("No need to insert another coin, cost is paid. Turn the Crank to get the gumball");
        }
    }

    public void ejectCoin() {
        gumballMachine.moneyInMachine = 0;
        gumballMachine.setState(gumballMachine.getNoCoinState());
        System.out.println("Coins returned");
    }

    public void turnCrank() {
        int remainingCost =  gumballMachine.gumballCost - gumballMachine.moneyInMachine;
        System.out.println("Enough money hasn't yet been inserted in the Machine");
        System.out.println("Need to insert another " + remainingCost + " cents");
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public String toString() {
        int remainingCost =  gumballMachine.gumballCost - gumballMachine.moneyInMachine;
        return "waiting for remaining cost " + remainingCost;
    }
}