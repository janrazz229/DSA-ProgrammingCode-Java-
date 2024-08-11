package ArrrayListSelff;

import java.util.ArrayList;

public class MaximumNo 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer>l1=new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		
		int max=Integer.MIN_VALUE;
		for(int i=0; i<=l1.size()-1; i++)
		{
			if(l1.get(i)>max)
			{
				max=l1.get(i);
			}
			
				
		}
		System.out.println(max);
		
		
	}

}
