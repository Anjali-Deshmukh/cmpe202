import java.util.ArrayList;
import java.util.Arrays;

public class BuildOrder {

    public ArrayList<String> orderIn;
    private PrintStrategy strategy;

    public PrintStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(PrintStrategy strategy) {
        this.strategy = strategy;
    }

    BuildOrder(){
        orderIn = new ArrayList<>();
    }

    public void takeOrder(){
        //Hardcoding order in
        this.orderIn = new ArrayList<>(Arrays.asList( "{{{{ BACON }}}}",
                                                        "LETTUCE",
                                                        "TOMATO",
                                                        "->G ONION",
                                                        "->JALA GRILLED"));
    }


    public static void main(String args[]) {
        BuildOrder order = new BuildOrder();
        order.takeOrder();

        //Action = Print Receipt
        order.setStrategy(new PrintReceipt());

        order.getStrategy().printOrder(order);

        //Action = Print Packing
        order.setStrategy(new PrintPacking());

        order.getStrategy().printOrder(order);
    }
}


