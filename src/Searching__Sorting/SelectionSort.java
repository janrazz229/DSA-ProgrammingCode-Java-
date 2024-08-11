package Searching__Sorting;

public class SelectionSort 
{
	public static void findSmallest(int nums[])
	{
		for(int i=0;i<nums.length-1;i++) 
		{
			int minPosition = i;
			for(int j=i+1;j<nums.length;j++) 
			{
				if(nums[minPosition]>nums[j])
				{
					minPosition = j; 
				}
				
		    }
			int temp = nums[i];
			nums[i] = nums[minPosition];
			nums[minPosition] = temp;
	    }
		
		
		
    }
	public static void main(String[] args) 
	{
		int nums[]={5,4,1,3,2};
		findSmallest(nums);
		for(int i=0; i<=nums.length-1; i++)
		{
			System.out.print(nums[i]+" ");
		}
		
	}

}
