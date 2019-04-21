
public class OrganicMeat implements BurritoBowl1 {

	public OrganicMeat()
	{
		
	}

	@Override
	public double burritoBowl1Charge(double burritoPrice) {

		System.out.println("Organic Meat Charges");

		double BurritoBowl1Price = burritoPrice + 4;
		
		return BurritoBowl1Price;
	}
}
