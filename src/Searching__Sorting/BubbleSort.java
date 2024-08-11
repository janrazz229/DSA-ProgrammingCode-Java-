package Searching__Sorting;

public class BubbleSort 
{
	public static void check(int nums[])
	{
		for(int i=0; i<=nums.length-1; i++)
		{
			for(int j=i+1; j<=nums.length-1;j++)
			{
				if(nums[i]>nums[j])
				{
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
	}
	
	
	public static void main(String[] args) 
	{
		int nums[]={5,2,7,6,8,7};
		check(nums);
		for(int i=0; i<=nums.length-1; i++)
		{
			System.out.print(nums[i]+" ");
		}
	}

}
