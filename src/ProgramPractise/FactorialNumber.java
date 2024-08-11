package ProgramPractise;

import java.util.Scanner;

public class FactorialNumber 
{
	public static void print(int num)
	{
		int f=1;
		for(int i=1; i<=num; i++)
		{
			f=f*i;
		}
		System.out.println(f);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Numnber");
		int num=sc.nextInt();
		print(num);
		
	}

}
