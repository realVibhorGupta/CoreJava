package coreJava;

public class Encapsulation {
		private void get_information()
		{
			System.out.println("This is pvt method");
		}
		 void permission()
		{
			get_information();
		}
		public void permission1()
			{
				get_information();
			}
		protected void permission2()
			{
				get_information();
			}

}
