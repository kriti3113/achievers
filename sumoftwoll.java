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
	public static LinkedList1 insertatend(LinkedList1 li,int data)
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

public static String converttostring(LinkedList1 li)
{ 
  Node temp=li.head;
  String d=new String();
  while(temp!=null)
  {
  String s=Integer.toString(temp.data);
    d=d+s;
    temp=temp.next;
  }
    return d;
}
 public static String reverse(String r)
 {
  StringBuilder sb=new StringBuilder(r);
  sb.reverse();
  String c=new String(sb);
  return c;
 }
	public static void main(String args[])
	{
    Scanner sc=new Scanner(System.in);
		LinkedList1 li1=new LinkedList1();
    LinkedList1 li2=new LinkedList1();
    System.out.println("Enter the size of first list");
    int n=sc.nextInt();
    System.out.println("Enter the elements of first list");
    for(int i=0;i<n;i++)
    {
      int v=sc.nextInt();
		li1.insertatend(li1,v);
    }
    System.out.println("Enter the size of second list");
    int m=sc.nextInt();
    System.out.println("Enter the elements of second list");
    for(int i=0;i<n;i++)
    {
      int w=sc.nextInt();
    li2.insertatend(li2,w);
    }
  String d=converttostring(li1);
  String d1=converttostring(li2);
  String c=reverse(d);
   int x=0,y=0;
    x=Integer.parseInt(c);
   String c1=reverse(d1);
    y=Integer.parseInt(c1);
  int sum=x+y;
String g=Integer.toString(sum);
  String g1=reverse(g);
  char arr[]=g1.toCharArray();
 System.out.println("sum of two LinkedList elements are ");
  for(int i=0;i<arr.length;i++)
    System.out.print(arr[i]+" ");
 
	}
}
