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
		//newnode.next=null;
		if(li.head==null)
		{
			li.head=newnode;
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
	public static LinkedList1 deletebeg(LinkedList1 li)
	{
		Node temp=li.head;
		li.head=li.head.next;
		return li;
	}
	public static LinkedList1 fun(LinkedList1 li,int k)
	{
      Node temp=li.head;
      while(k!=0)
      {
      	rotate(li,temp.data);
        deletebeg(li);
        temp=temp.next;
        k--;
      }
 
      return li;
	}
	public static LinkedList1 rotate(LinkedList1 li,int data)
	{
		Node n=new Node(data);
		Node temp=li.head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=n;
		n.next=null;
		return li;
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
	public static void main(String[] args) {
		LinkedList1 li=new LinkedList1();
		System.out.println("Enter the value of number of nodes");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the data values");
		for(int i=0;i<n;i++)
		{
			int data=sc.nextInt();
         li.insert(li,data);
		}
		System.out.println("Enter the value of k");
		int k=sc.nextInt();
		//display(li);
		fun(li,k);
		display(li);

	}}
