package coreJava;

public class ClonableObject1  {

	public static void main(String[] args) {
		
		
		ClonableObject obj=new ClonableObject();
		obj.i=10;
		obj.ch='v';
		try
		{
			
			obj.test();
		}
		catch(CloneNotSupportedException cnse)
		{
			System.out.println(cnse.getMessage());
		}

	}

}
