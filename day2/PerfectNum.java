package day2;

import java.util.Scanner;

public class PerfectNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = x;
		int sum =0;
		for(int i=1;i<x;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println("its a perfect number");
		}
		else
		{
			System.out.println("it is not a perfect number");
		}

	}
}
