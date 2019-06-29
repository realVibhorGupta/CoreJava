package coreJava;

public class ParameterisedMethods {

	int height;
	int width;
	int area;
	 void setdata(int height,int width){
		this.height=height;
		this.width=width;
		 
		this.area=height*width;
	 }
	 
	 
	 void getdata(){
		 
		 System.out.println(area);
	 }
}
