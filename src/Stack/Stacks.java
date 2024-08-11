package Stack;

import java.util.ArrayList;

public class Stacks 
{
	static class Stack
	{
		static ArrayList<Integer>l1=new ArrayList<>();
		public static boolean isEmpty()
		{
			return l1.size()==0;
		}
		
		public static void push(int data)
		{
			l1.add(data);
		}
		public static int pop(int data)
		{
			int top=l1.get(l1.size()-1);
			l1.remove(l1.size()-1);
			return top;
		} 
		public static Integer peek(int data)
		{
			return l1.get(l1.size()-1);
		}
		
	}
	public static void main(String[] args) 
	{
		
		Stack s1=new Stack();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		
		while(!s1.isEmpty())
		{
			System.out.println(s1.peek(3));
		}

	}

}
