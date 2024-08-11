package ProgramPractise;

import java.util.Scanner;

public class PrimeNo_Range 
{
     
	public static boolean check(int num)
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
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void print(int end)
	{
		for(int i=0; i<=end; i++)
		{
			if(check(i)==true)
			{
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Numnber");
		int end=sc.nextInt();
		print(end);
	}

}
