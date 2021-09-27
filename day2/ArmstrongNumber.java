package day2;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Value");
		int num=sc.nextInt();
		int sum = 0,res=1;
		int a= num;
		int count = 0;
		while (a>0)
		{
			a=a/10;
			count++;
		}
		int n = num;
		while(n>0)
		{
			int d = n%10;
			for(int i=0;i<count;i++)
			{
				res=res*d;
			}
			sum+=res;
			n=n/10;
			res=1;
		}
		if(sum==num)
		{
			System.out.println(num+" is a armstrong no");
		}
		else
		{
			System.out.println(num+" is not an armstrong no");
		}
	}

}
