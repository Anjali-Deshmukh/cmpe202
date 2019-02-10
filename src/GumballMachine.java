import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GumballMachine {
    State soldOutState;
    State noCoinState;
    State hasCoinsState;
    State hasEnoughCoinsState;
    State soldState;

    public int count = 0; // count of gumballs
    public List<Integer> validCoins;
    public int gumballCost;   //cost of gumball on the Machine
    public  State state = soldOutState;
    public int moneyInMachine = 0;


    public GumballMachine(int numberGumballs, int cost, List<Integer> validCoins) {
        soldOutState = new SoldOutState(this);
        noCoinState = new NoCoinState(this);
        hasCoinsState = new HasCoinsState(this);
        hasEnoughCoinsState = new HasEnoughCoinsState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noCoinState;
        }

        this.gumballCost = cost;
        this.validCoins = validCoins;
    }

    public void insertCoin(int coin) {
        state.insertCoin(coin);
    }

    public boolean validateCoin(int coin){
        if(validCoins.contains(coin))
            return true;
        else
            return false;
    }

    public void ejectCoin() {
        state.ejectCoin();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    int getCount() {
        return count;
    }

    void refill(int count) {
        this.count = count;
        state = noCoinState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinsState() {
        return hasCoinsState;
    }

    public State getHasEnoughCoinsState(){
        return hasEnoughCoinsState;
    }

    public State getSoldState() {
        return soldState;
    }


    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2019");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nMachine accepts coins: " + validCoins.toString());
        result.append("\nMachine is " + state + "\n");
        return result.toString();
    }
}
