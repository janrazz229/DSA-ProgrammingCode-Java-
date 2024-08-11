  package Searching__Sorting;

public class BinarySearch 
{
	public static boolean check(int nums[],int key)
	{
		int start=0; 
		int end=nums.length-1;
			while(start<=end)
			{
				int mid=start+(end-start)/2;
			if(nums[mid]==key)
			{
				return true;
				
			}
			else if(nums[mid]>key)
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
			
			
		}
		
		return false;
	}
	public static void main(String[] args) 
	{
		int nums[]= {1,2,3,5,7,9,55};
		System.out.println(check(nums, 515));
		 
		
	}
}

