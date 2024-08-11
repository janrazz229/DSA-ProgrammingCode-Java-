package ProgramPractise;

import java.util.Scanner;

public class EvenLOgic 
{
	
	public static boolean print(int num) 
	{
	 return ((num&1)==0); 
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Numnber");
		int num=sc.nextInt();
		System.out.println(print(num));
	}

}
