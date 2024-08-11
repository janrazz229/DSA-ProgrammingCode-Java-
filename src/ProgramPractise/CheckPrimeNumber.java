  package ProgramPractise;

import java.util.Scanner;

public class CheckPrimeNumber 
{
	public static void print(int num)
	{
		int c=0;
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("NOt Prime Number");
		}
	}
		
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Numnber");
		int num=sc.nextInt();
		print(num);
		
	}

}
