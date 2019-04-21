
public class Quinoa implements BurritoBowl1 {

	public Quinoa() 
	{
		
	}

	@Override
	public double burritoBowl1Charge(double burritoPrice) {

		System.out.println("Quinoa Charges");

		double BurritoBowl1Price = burritoPrice + 5;
		
		return BurritoBowl1Price;
		
	}
}
