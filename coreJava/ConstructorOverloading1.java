package coreJava;

public class ConstructorOverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading obj=new ConstructorOverloading("vibhor", 26);
		ConstructorOverloading obj1=new ConstructorOverloading("vibhor", 26, "male");
		obj.display();
		obj1.display();
	}

}
