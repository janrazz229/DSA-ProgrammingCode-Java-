package ProgramPractise;

import java.util.Scanner;

public class GCD 
{
	public static void print(int a,int b)
	{
		int c=1;
		for(int i=1; i<=a&& i<=b; i++)
		{
			if(a%2==0 && b%2==0)  
			{
				c=i;
			}
		}
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Numnber");
		int a=sc.nextInt();
		System.out.println("Enter b Numnber");
		int b=sc.nextInt();
		print(a,b);
		
	}

}
