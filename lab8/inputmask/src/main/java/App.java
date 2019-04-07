/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private CreditCardNum num;
    private CreditCardExp exp;
    private CreditCardCVC cvc;
    private CreditCardDecorator ccd;
    private CreditCardExpDecorator cce;
    private int count;

    public App() {

        screen = new Screen();
        num = new CreditCardNum();
        exp = new CreditCardExp();
        cvc = new CreditCardCVC();
        ccd = new CreditCardDecorator(num);
        cce = new CreditCardExpDecorator(exp);

        screen.addSubComponent(ccd);
        screen.addSubComponent(cce);
        screen.addSubComponent(cvc);

        num.setPrevHandler(num);
        exp.setPrevHandler(num);
        cvc.setPrevHandler(exp);

        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
        count++;
        screen.key(ch, count);
    }

}

