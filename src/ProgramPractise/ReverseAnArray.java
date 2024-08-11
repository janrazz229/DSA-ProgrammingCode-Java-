package ProgramPractise;

public class ReverseAnArray 
{
	public static void main(String[] args) {
		int num[]= {2,5,8,6};
		int n=num.length;
		for(int i=0; i<n/2; i++)
		{
			int temp=num[i];
			num[i]=num[n-i-1];
			num[n-i-1]=temp;
			
			
		}
		for(int i:num)
		{
			System.out.print(i+" ");
		}
		
	}
	
	

}
