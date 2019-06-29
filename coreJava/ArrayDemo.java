package coreJava;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		String[] arrayOfWeekdays ={"Monday","Tuesday","Wednesday","Thursday","Friday"};
		
		String str[]=new String[4];
		
		if(str.equals(arrayOfWeekdays[0]))
		{
			System.out.println("Today Is Monday!!");
			return ;
		}
		
		else if(str.equals(arrayOfWeekdays[1]))
		{
			System.out.println("Today Is Tuesday!!");
			return;
		}
		 else if(str.equals(arrayOfWeekdays[2]))
		{
			System.out.println("Today Is Wednesday!!");
			return;
		}
		
		else if(str.equals(arrayOfWeekdays[3]))
		{
			System.out.println("Today Is Thursday!!");
			return;
		}
		else	
		{
			System.out.println("Today Is Friday!!");
			return;
		}
	
		
	}

}
