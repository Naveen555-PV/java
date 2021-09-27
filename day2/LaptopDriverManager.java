package day2;

import java.util.Scanner;

public class LaptopDriverManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Lname=sc.next();
		double price = sc.nextDouble();
		String Color = sc.next();
		int Lid=sc.nextInt();
		sc.close();
		Laptop l1 = new Laptop(Lname, price,Color,Lid);
		Laptop l2 = new Laptop(Lname,price,Color,Lid);
		System.out.println("The details of laptop are");
		l1.printDetails();
		l2.printDetails();
		
		
	}

}
