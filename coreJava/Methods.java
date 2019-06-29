package coreJava;

public class Methods {
	static void get_data(){
		System.out.println("A");
	}
	
	
	public static void main(String args[]){
		
		Methods.get_data();
		@SuppressWarnings("unused")
		Methods obj=new Methods();
		//obj.get_data();
		
		
	}
	}
//static methods can be called in the main method by constructors