package coreJava;

public class Static {
	int roll;
	static String name;
	static String college="DBIT";
	static void college(){
		String college="UPES";
		System.out.println(college);
	}
	Static(int r,String n){
		roll=r;
		name=n;
		
	}
	void StaticDetails()
	{
		
		System.out.println(roll+""+name+""+college);
	}
}
