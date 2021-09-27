package day2;

public class Laptop {
	
		String Lname;
		double price;
		String Color;
		int Lid;
		
		Laptop()
		{
			
		}
		Laptop(String Lname)
		{
			this.Lname=Lname;
		}
		Laptop(String Lname,double price)
		{
			this(Lname);
			this.price=price;
		}
		Laptop(String Lname,double price,String color)
		{
			this(Lname,price);
			this.Color=color;
		}
		
		
		Laptop(String Lname,double price,String Color,int Lid)
		{
			this(Lname,price,Color);
			this.Lid=Lid;
			
			
		}
		public void printDetails()
		{
			System.out.println(Lname);
			System.out.println(price);
			System.out.println(Color);
			System.out.println(Lid);
		}
		
		
	}


