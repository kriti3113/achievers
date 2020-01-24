import java.util.Scanner;
class ReverseLinkedList
{
	static Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static ReverseLinkedList insert(ReverseLinkedList li,int data)
	{ 
		Node newnode=new Node(data);
		newnode.next=null;
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
	public static ReverseLinkedList reverse(ReverseLinkedList li)
	{
			Node next=null;
				Node prev=null;
				Node curr=li.head;
				while(curr!=null)
				{
					next=curr.next;
					curr.next=prev;
					prev=curr;
					curr=next;
				}
				li.head=prev;
			return li;
	}
	public static void display(ReverseLinkedList li)
	{
		Node temp=li.head;
		System.out.println("the linkedlist is:");
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
          temp=temp.next;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ReverseLinkedList li=new ReverseLinkedList();
        for(int i=1;i<n;i++)
        	insert(li,i);
        display(li);
        reverse(li);
        display(li);
	}
}