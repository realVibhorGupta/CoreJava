package coreJava;
import java.util.*;
public class InputFromUser {

		String name;
		int roll;
		String course;
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner	 obj=new Scanner(System.in);
		System.out.println("ENTER YOUR NAME");
		String name=obj.next();
		
		System.out.println("ENTER YOUR ROLL NUMBER");
		int roll=obj.nextInt();
		
		System.out.println("ENTER YOUR COURSENAME");
		String course=obj.next();
		
		System.out.println("your name is"+name);
		System.out.println("your rollnumber is"+roll);
		System.out.println("your coursename is"+course);

	}

}
