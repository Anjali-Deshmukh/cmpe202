public class HasEnoughCoinsState implements State{
    GumballMachine gumballMachine;

    public HasEnoughCoinsState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertCoin(int coin) {
        System.out.println("You can't insert another coin, machine already has enough money for a Gumball");
        System.out.println("Turn the Crank to get the gumball");
    }

    public void ejectCoin() {
        System.out.println("Coins returned");
        gumballMachine.setState(gumballMachine.getNoCoinState());
        gumballMachine.moneyInMachine = 0;
    }

    public void turnCrank() {
        System.out.println("You turned...");
    }

    public void dispense() {
        gumballMachine.releaseBall();
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }

    public String toString() {
        return "waiting for turn of crank";
    }

}
