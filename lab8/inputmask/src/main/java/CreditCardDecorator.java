public class CreditCardDecorator extends Decorator {


    CreditCardDecorator(IDisplayComponent component) {
        super(component);
    }

    public String display() {
        String number = component.display();
        if ( number.equals("") )
            return "[4444 4444 4444 4444]" + "  " ;

        char[] numberArr = number.toCharArray();
        String output = "";
        for (int i = 0; i < numberArr.length; i++) {
            output += numberArr[i];

            if (((i+1) % 4 == 0) && i != 0 && i != 15) {
                output += " ";
            }
        }
        return "[" + output + "]" + "  ";
    }

}
