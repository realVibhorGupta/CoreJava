package coreJava;

public class Car_Interface implements Tax_Interface{
		
		String name;
		double price;
		
		


Car_Interface(String name,double price)
{
	this.name=name;
	this.price=price;
	
}

public double tax()
{
	return price+tax_rate;
}
}