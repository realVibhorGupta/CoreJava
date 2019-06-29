package coreJava;

public class ConstructorOverloading {
		
				String name;
				int age;
				String sex;
			public ConstructorOverloading(String n,int a) {
				// TODO Auto-generated constructor stub
				
				name=n;
				age=a;
				
			}
			public ConstructorOverloading(String n,int a ,String s) {
				// TODO Auto-generated constructor stub
				sex=s;
				name=n;
				age=a;
				
			}
			void display(){
				
				System.out.println(name+"is"+age+"years old and is"+sex);
				
			}
}
