package Searching__Sorting;

public class LinearSearch 
{
	public static boolean print(int nums[],int key)
	{
		for(int i=0; i<=nums.length-1; i++)
		{
			if(nums[i]==key)
			{
				return true;
			}
			
		}
		return false;
	}
	public static void main(String[] args) 
	{
		int nums[]= {10,20,55,14,25};
		int key=25;
		System.out.println(print(nums,25));
		
	}

}
