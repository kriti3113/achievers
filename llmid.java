import java.util.Scanner;
class LinkedList1
{
	 Node head;
	 static class Node{
		int data;
		 Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static LinkedList1 insert(LinkedList1 li,int data)
	{
		Node newnode=new Node(data);
		newnode.next=null;
		if(li.head==null)
		{
			li.head=newnode;
			//li.r=newnode;
		}
		else
		{
			Node last =li.head;

			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newnode;
			newnode.next=null;
		}
		return li;
	}
	public static int count(LinkedList1 li)
	{
		int countt=0;
		Node temp=li.head;
		
		while(temp!=null)
		{
			countt++;
			temp=temp.next;
		}
		return countt;
	}
	public static void display(LinkedList1 li)
	{
		Node temp=li.head;
		System.out.println("the linkedlist is:");
		while(temp!=null)
		{
			System.out.println(temp.data);
          temp=temp.next;
		}
		
	}
	public static LinkedList1 midinsert(LinkedList1 li,int key)
	{
		if(li.head==null)
			return li;
		else
		{
		int c=0;
       int mid=count(li)/2;
       Node temp=li.head;
       Node temp1=null;
       Node n=new Node(key);
       while(temp.next!=null)
       {
       	temp1=temp.next;
       	c++;
       	if(c==mid)
       	  {
       	  	temp.next=n;
			n.next=temp1;
       	  }
       	temp=temp.next;
       }}
       return li;
	}
	public static void main(String args[])
	{
		LinkedList1 li=new LinkedList1();
		Scanner sc=new Scanner(System.in);
		li.insert(li,1);
		li.insert(li,2);
		li.insert(li,3);
		li.insert(li,4);
		li.insert(li,5);
		li.insert(li,6);
		display(li);
		System.out.println("Enter the value of key");
		int key=sc.nextInt();
		li.midinsert(li,key);
		display(li);
	}}