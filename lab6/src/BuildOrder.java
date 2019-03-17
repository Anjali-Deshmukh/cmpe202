import java.util.ArrayList;
import java.util.Arrays;

public class BuildOrder {

    public ArrayList<String> orderIn;

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

        PrintStrategy printStrategy1 = new PrintReceipt();
        PrintStrategy printStrategy2 = new PrintPacking();

        printStrategy1.printOrder(order);

        printStrategy2.printOrder(order);

    }
}


