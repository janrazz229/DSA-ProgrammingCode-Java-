package Recursion;

import java.util.Scanner;

public class factorialNo 
{
	public static int fact(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		else
		{
			int result=n*fact(n-1);
		}

		return n;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println(fact(n));
		
	}
}