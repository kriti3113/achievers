import java.util.*;
class dll
{
	 Node head;
	static class Node
	{ 
		Node next;
		Node prev;
		int data;

		Node(int d)
		{
		data=d;	
		next=null;
		prev=null;
		}
	}
	public static dll insertend(dll l,int data)
     {
      Node n=new Node(data);
      if(l.head==null)
      {
        l.head=n;
      }
      Node temp=l.head;
      while(temp.next!=null)
      {
      	temp=temp.next;
      }
      temp.next=n;
      n.prev=temp;
      n.next=null;
      return l;
     }
     public static void display(dll l)
     {
     	Node temp=l.head;
     	while(temp!=null)
     	{
     		System.out.println(temp.data);
     		temp=temp.next;
     	}
     }

     	public static dll reverse(dll l)
			{
				Node next=null;
				Node prev=null;
				Node curr=l.head;
				while(curr!=null)
				{
					next=curr.next;
					curr.next=prev;
					prev=curr;
					curr=next;
				}
				l.head=prev;
				return l;
			}
   
     public static void main(String[] args) {
     	dll l=new dll();
     	Scanner sc=new Scanner(System.in);
     	System.out.println("Enter the value of n");
     	int n=sc.nextInt();
     	for(int i=0;i<n;i++)
     	{
     		int data=sc.nextInt();
     		insertend(l,data);
     	}
     	reverse(l);
     	System.out.println("After reversing the doubly linkedlist is");
     	display(l);

     }}