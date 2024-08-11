package ProgramPractise;

import java.util.Scanner;

public class LCM 
{
	public static void print(int a,int b)
	{
		int lcm,hcf;
		int product = a*b;
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
		hcf=b;
		System.out.println("hcf: "+hcf);
		lcm = product / hcf;
		System.out.println("lcm: "+lcm);
		
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
