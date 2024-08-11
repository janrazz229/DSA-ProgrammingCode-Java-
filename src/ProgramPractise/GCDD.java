package ProgramPractise;

import java.util.Scanner;

public class GCDD 
{
	public static void print(int a,int b)
	{
		while(a!=b)
		{
			 if(a>b)
			 {
				 a=a-b;
			 }
			 else
			 {
				 b=b-a;
			 }
		}
		System.out.println(b);
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
