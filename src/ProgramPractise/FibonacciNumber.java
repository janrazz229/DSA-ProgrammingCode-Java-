package ProgramPractise;

import java.util.Scanner;

public class FibonacciNumber 
{
	public static int print(int num)
	{
		if(num==0 || num==1)
		{
			return num;
		}
		return print(num-1)+print(num-2);
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		System.out.println(print(num));
		
	}

}
