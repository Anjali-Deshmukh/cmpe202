import java.util.ArrayList;
public class PrintReceipt implements PrintStrategy{

    public void printOrder(BuildOrder order){

        ArrayList<String> finalPrint = order.orderIn;

        System.out.println("Printing Order Receipt ");

        for(int i=0; i<finalPrint.size(); i++){

            System.out.println(finalPrint.get(i));
        }

        System.out.println("\n");

    }
}

