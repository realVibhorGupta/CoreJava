package coreJava;

public class InstanceVariables {
	
		double width=20;
		double height=10;
		double area=width*height;
		double area1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 InstanceVariables obj=new InstanceVariables();
		double area2= obj.height*obj.width;
		 System.out.println(obj.area);
		System.out.println(obj.area1);
		System.out.println(area2);
	}

}
