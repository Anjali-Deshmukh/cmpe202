import java.util.ArrayList;

public class PrintPacking implements PrintStrategy {
    public ArrayList<String> onTopBun;
    public ArrayList<String> onBottomBun;
    public ArrayList<String> onMeat;

    PrintPacking(){
        onTopBun = new ArrayList<>();
        onBottomBun = new ArrayList<>();
        onMeat = new ArrayList<>();
    }

    public void segregateOrder(ArrayList<String> orderIn){
        for(int i=0; i<orderIn.size(); i++) {
            if(orderIn.get(i).contains("->")) {
                onMeat.add(orderIn.get(i));
            }else if(orderIn.get(i).contains("{{{{")){
                onBottomBun.add(orderIn.get(i));
            }else{
                onTopBun.add(orderIn.get(i));
            }
        }

    }


    public void printOrder(BuildOrder order){

        segregateOrder(order.orderIn);

        System.out.println("Printing Packing order ");

        for(int i=0; i<onTopBun.size(); i++){
            System.out.println(onTopBun.get(i));
        }

        for(int i=0; i<onMeat.size(); i++){
            System.out.println(onMeat.get(i));
        }

        for(int i=0; i<onBottomBun.size(); i++){
            System.out.println(onBottomBun.get(i));
        }

        System.out.println("\n");
    }
}
