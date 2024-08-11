package ProgramPractise;

import java.util.Scanner;

public class EvenOdd 
{
	public static void print(int num) 
	{
//		if(num%2==0)
			if((num&1)==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
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
