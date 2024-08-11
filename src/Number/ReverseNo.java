package Number;

import java.util.Scanner;

public class ReverseNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int num = 0;
		int res;
		while(num>0)
		{
			res=num%10;
			num=num/10;
			
		}
		System.out.println(num);
		
	}

}
