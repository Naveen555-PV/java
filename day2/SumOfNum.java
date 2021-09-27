package day2;

import java.util.Scanner;

public class SumOfNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,sum=0;
		System.out.println("Enter the Number: ");
		int n1=sc.nextInt();
		while(n1>0)
		{
			num=n1%10;
			sum=sum+num;
			n1=n1/10;
		}
		System.out.println("sum of num is: "+sum);
		
	}

}
