/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum extends FocusHandler implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;

	private String number = "" ;

	public void setNext( IKeyEventHandler next) {
		this.nextHandler = next ;
	}

	public String display() {
		//return "[" + number + "]" + "  " ;
		return number;
	}

	public void key(String ch, int cnt) {
		if (ch.equals("X") || ch.equals("Delete")) {
			if ( number == "") {
				screen.setCurrentFocus(prevHandler);
				return;
			} else
				number = number.substring(0, number.length() - 1);

		} else if ( number.length() < 16 ) {
			number += ch ;
			if (number.length() == 16) {
				screen.setCurrentFocus(nextHandler);
			}
		}
	}

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}