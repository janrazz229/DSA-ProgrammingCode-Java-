package Challenge100Days;

public class Google1 
{
	public static int find(int[] num)
	{
		int max=num[0];
		int sMax=-1;
		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]>max)
			{
				sMax=max;
				max=num[i];
			}
			if(num[i]>sMax && num[i]<max)
			{
				sMax=num[i];
			}
		}
		return sMax;
	}
	public static void main(String[] args) 
	{
		int[] num= {2,3,1,5,17,6,2,6,4,12,32,15};
		System.out.println(find(num));
//		int modi[]= {3,2,5};
//		int rahul[]= {6,1,1};
//		
//		
//		int max1=Integer.MIN_VALUE;
//	 for(int i=0; i<=modi.length-1; i++)
//	 {
//		 if(max1<modi[i])
//		 {
//			 max1=modi[i];
//		 }
//	 }
//	 System.out.println("Maximum value of modi:->"+max1);
//	 int max2=Integer.MIN_VALUE;
//	 for(int i=0; i<=rahul.length-1; i++)
//	 {
//		 if(max2<rahul[i])
//		 {
//			 max2=rahul[i];
//		 }
//	 }
//	 System.out.println("Maximum value of rahul:->"+max2);
	}
	}
	



 