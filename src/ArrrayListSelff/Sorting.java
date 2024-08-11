package ArrrayListSelff;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer>l1=new ArrayList<>();
		l1.add(10);
		l1.add(40);
		l1.add(30);
		l1.add(60);
		l1.add(20);
		l1.add(50);
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println("Asscending Order->"+l1);
		
		//Descending Order
		Collections.sort(l1,Collections.reverseOrder());
		System.out.println("Descending Order->"+l1);

}
}
