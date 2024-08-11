package Number;

public class SwapN 
{
	public static void main(String[] args) 
	{
		int a=10; 
		int b=20;
//		int temp;
//		temp=a;
//		a=b;
//		b=temp;
		//without using 3rd variable
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
