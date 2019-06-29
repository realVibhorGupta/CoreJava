package coreJava;

public class NonStaticMethods {
	void get_data(){
		System.out.println("hello");
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticMethods obj=new NonStaticMethods();
		obj.get_data();
		//NonStaticMethods.get_data();
		//this cannot be done
	}

}
