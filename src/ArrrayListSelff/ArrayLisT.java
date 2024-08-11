package ArrrayListSelff;

import java.util.ArrayList;

public class ArrayLisT 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer>l1= new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
//		System.out.println(l1);
//	int element=l1.get(2);
//	System.out.println(element);
//	l1.remove(2);
//	System.out.println(l1);
//	l1.set(2, 100);
//	System.out.println(l1);
//System.out.println(l1.contains(200));
//l1.add(3, 500);
//System.out.println(l1);
//System.out.println("Size->"+l1.size());
for(int i=0; i<l1.size(); i++)
{
	System.out.print(l1.get(i)+" ");
}
System.out.println();
	
		
	}

}
