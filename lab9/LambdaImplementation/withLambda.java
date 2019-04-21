
import java.util.Arrays;
import java.util.List;

public class withLambda {

	public static void main(String [] args) {

		//Function call using Lambda
		
		List<BurritoBowl> burritoList =
				Arrays.asList(
						(burritoPrice) -> { System.out.println("Organic Meat Charges"); return burritoPrice + 4; },
						(burritoPrice) -> { System.out.println("Quinoa Charges"); return burritoPrice + 5 ; },
						(burritoPrice) -> { System.out.println("Veggie Bowl Charges"); return burritoPrice + 3 ; }

			);

		//Burger Charges applied in different ways. Added initial charger as 0 and new burger charges get added whenever it gets called.

		burritoList.forEach((burritoStrategy) -> System.out.println(burritoStrategy.burritoBowlCharges(0.0)));
	}
}
