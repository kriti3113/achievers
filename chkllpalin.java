import java.util.Scanner;
class LinkedList1
{
	 Node head;
      Node r;
	 static class Node{
		int data;
		 Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static LinkedList1 insertend(LinkedList1 li,int data)
	{
		Node newnode=new Node(data);
		newnode.next=null;
		if(li.head==null)
		{
			li.head=newnode;
			li.r=newnode;
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
	public static String converttostring(LinkedList1 li)
	{
		int i=0;
		String str=new String();
		Node temp=li.head;
		while(temp!=null)
		{
			String d=Integer.toString(temp.data);
			str=str+d;
			temp=temp.next;
		}
     return str;
	}
	public static void chkpalindrome(String str)
	{
		//import java.util.*;
       StringBuilder sb=new StringBuilder(str);
       sb.reverse();
       String s=new String(sb);
        if(s.equals(str))
        {
        	System.out.println("Given LinkedList is palindrome");
        }
        else
        {
        	System.out.println("Given LinkedList is not palindrome");
        }
	}
	public static void main(String[] args) {
	LinkedList1 li=new LinkedList1();
	System.out.println("Enter the number of elements of LinkedList");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println("Enter the elements of LinkedList");
	for(int i=0;i<n;i++)
	{
		int data=sc.nextInt();
	insertend(li,data);
	}
	String str=converttostring(li);
	chkpalindrome(str);
}
}