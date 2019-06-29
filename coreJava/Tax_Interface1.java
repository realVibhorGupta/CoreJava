package coreJava;

public class Tax_Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods_Interface obj=new Goods_Interface("Watch", 100.34);
		obj.printDetails();
		Car_Interface obj1=new Car_Interface("honda city",800000);
		obj1.tax();
		System.out.println(obj1.tax());
	}

}