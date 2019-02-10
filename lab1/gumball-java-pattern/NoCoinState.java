public class NoCoinState implements State {
    GumballMachine gumballMachine;

    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertCoin(int coin) {
        System.out.println("You inserted a coin: " + coin);
        if(!gumballMachine.validateCoin(coin)) {
            System.out.println("This is not a valid coin for this machine");
            System.out.println("Valid coins for this machine are " + gumballMachine.validCoins.toString());
            return;
        }

            gumballMachine.setState(gumballMachine.getHasCoinsState());
            gumballMachine.moneyInMachine = coin;

            if(coin==gumballMachine.gumballCost){
                gumballMachine.setState(gumballMachine.getHasEnoughCoinsState());
            }

    }

    public void ejectCoin() {
        System.out.println("You haven't inserted a coin");
    }

    public void turnCrank() {
        System.out.println("You turned, but there's no coin");
    }

    public void dispense() {
        System.out.println("You need to pay first");
    }

    public String toString() {
        return "waiting for coin";
    }
}