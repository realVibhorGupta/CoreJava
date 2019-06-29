package coreJava;

public class InterFace_Demo implements MyInterface {
		int a=3;
	@Override
	public void add() {
		
	int c=a+b;
	System.out.println(c);

	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int c=a-b;
		System.out.println(c);

	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		int c=a/b;
		System.out.println(c);

	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		int c=a*b;
		System.out.println(c);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterFace_Demo obj=new InterFace_Demo();
		obj.add();
		obj.sub();
		obj.div();
		obj.mul();
		

	}

}
