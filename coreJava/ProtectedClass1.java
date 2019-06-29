package coreJava;

public class ProtectedClass1 extends ProtectedClass {
	
	void function1()
	{
		System.out.println(width);
		
	}
	void function2(double w)
	{
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedClass1 obj=new ProtectedClass1();
		ProtectedClass1 obj1=new ProtectedClass1(); 
		 
		 obj.function1();
		 obj1.function2(2.2);
	}

}
