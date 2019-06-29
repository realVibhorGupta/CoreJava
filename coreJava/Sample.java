package coreJava;

public class Sample {

	 int add(int a,int b)
	{
		return a+b;
	
	}
	void disp(){
	System.out.println(this.add(2,3));	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Sample obj=new Sample();
		obj.disp();
		
	}

}
