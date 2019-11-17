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
	
        public static LinkedList1 duplicate(LinkedList1 li) {
            Node last=li.head;
            Node last1=null;
            Node prev=li.head;
            while(last!=null)
            {
                last1=last;
                while(last1.next!=null)
                {
                    if(last.data==last1.next.data)
                    {
                        last1.next=last1.next.next;
                        prev=last.next;
                    }
                    else
                    {
                        last1=last1.next;
                    }
                }
                prev=last;
                last=last.next;
            }
            return li;
        }
        public static void display(LinkedList1 li)
	{
		Node temp=li.head;
		while(temp!=null)
		{
		System.out.println(temp.data);
		temp=temp.next;
		}
	}
	public static void main(String[] args) {
		LinkedList1 li=new LinkedList1();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
     for(int i=0;i<n;i++)
     {
     	int a=sc.nextInt();
     	li.insert(li,a);
     }
     duplicate(li);
     System.out.println("The unique elements of LinkedList are");
     display(li);
	}
}