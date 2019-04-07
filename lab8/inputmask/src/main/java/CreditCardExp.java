/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp extends FocusHandler implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String date = "" ;

	public void setNext( IKeyEventHandler next) {
		this.nextHandler = next ;
	}

	public String display() {
		return date ;
	}

	public void key(String ch, int cnt) {
		if (ch.equals("X") || ch.equals("Delete")) {
			if ( date.equals("")) {
				screen.setCurrentFocus(prevHandler);
				return;
			} else
				date = date.substring(0, date.length() - 1);
		} else if ( date.length() < 4 ) {
			date += ch;
			if (date.length() == 4) {
				screen.setCurrentFocus(nextHandler);
			}
		}
	}

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}