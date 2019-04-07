public class CreditCardExpDecorator extends Decorator {

    CreditCardExpDecorator(IDisplayComponent component) {
        super(component);
    }

    public String display() {
        String date = component.display();
        if ( date.equals("") )
            return "[MM/YY]" + "  " ;

        String output = "[";
        char[] dateArr = date.toCharArray();
        for (int i = 0; i < dateArr.length; i++) {
            if (i == 2)
                output += "/";

            output += dateArr[i];
        }
        output += "]";
        return output + "  ";
    }
}
