package LinkedLisT;

public class LinkedList 
{
	public static class Node{
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
	
	
  }
	public static Node head;
	public static Node tail;
	public void addFirst(int data)
	{
//		step1-Create node
		Node newNode=new Node(data);
		if(head==null)
		{
			head=tail=newNode;
			return;
		}
	
		
//		step-2 newNode next=head;
		newNode.next=head;
		
		head=newNode;
	}
	
	
	public void addLast(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=tail=newNode;
			return;
		}
		tail.next=newNode;
		tail=newNode;
	}
	
	
	public static void main(String[] args) 
	{
		LinkedList l1=new LinkedList();
		l1.head=new Node(1);
		l1.head.next=new Node(2);
	
		l1.addFirst(20);
		l1.addLast(3);
		l1.addLast(4);
		
		
		
	}

}
