
public class Veggie implements BurritoBowl1 {

	public Veggie()
	{
		
	}

	@Override
	public double burritoBowl1Charge(double burritoPrice) {

		System.out.println("Veggie Bowl Charges");

		double BurritoBowl1Price = burritoPrice + 3;
		
		return BurritoBowl1Price;
	}
	
}
