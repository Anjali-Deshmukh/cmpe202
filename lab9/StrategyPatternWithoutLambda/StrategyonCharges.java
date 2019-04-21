

import java.util.Arrays;
import java.util.List;

public class StrategyonCharges {

	public static void main(String [] args) {

		List<BurritoBowl1> burgerList =
				Arrays.asList( new OrganicMeat(), new Quinoa(), new Veggie());

		//Burger Charges applied in different ways. Added intial changes with new burger charges
		
		for (BurritoBowl1 burritoBowl1 : burgerList) {
			System.out.println(burritoBowl1.burritoBowl1Charge(0.0));
		}
	}
}