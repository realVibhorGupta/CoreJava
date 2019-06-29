/**
 * 
 */
package coreJava;

/**
 * @author vibh
 *
 */
public class Goods_Interface {
	
	String name;
	double price;
	Goods_Interface(String name,double price)
	{
		this.name=name;
		this.price=price;
	}
	void printDetails()
	{
		System.out.println(name);
		System.out.println(price);
		
	}

}
