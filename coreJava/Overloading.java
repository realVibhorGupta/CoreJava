package coreJava;

public class Overloading {
			
			double height;
			double  width;
			
			
void setData(int h,int w){
				
				height=h;
				width=w;
				
				
			}
			void setData(double h,double w){
				height=h;
				width=w;
			}
			
			
			void display(){
				
				System.out.println(width);
				System.out.println(height);
				
				
			}		
			
	

}
