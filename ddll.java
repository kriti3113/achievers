import java.util.*;
class ddll
{
    Node head;
    //.nNode tail;
	static class Node
	{ 
		Node next;
		int data;
        Node prev;
		Node(int d)
		{
		data=d;	
		next=null;
		}
		//Node newnode=new Node(data);
	}
   public static ddll addend(ddll li,int d)
   {
   	Node newnode=new Node(d);
   	//Node tail

   	if(li.head==null)
   	{
   		li.head=newnode;
   	    li.head.prev=null;
   	}

   	else
   	{

   		Node tail=li.head;
   		Node curr=li.head;
          tail.next=newnode;
          tail=tail.next;
          curr=tail;
          curr.next=null;
   	}
    return li;
   }

   public static ddll deletebeg(ddll li)
   {
		Node curr=li.head;
		curr.next=null;
		curr=curr.next;
		li.head=curr;

     return li;
   }
public static ddll deleteend(ddll li)
{
	Node temp=li.head;
  while(temp.next.next!=null)
  {
  	temp=temp.next;
  }
  temp.next=null;
 return li;
}
public static ddll deletebyindex(ddll li,int index)
{
	Node current=li.head,prev=null;
	if(index==0&&current!=null)
		{
		li.head=current.next;
		System.out.println("node deleted at index "+index);
		}
	int count=0;
	while(current!=null)
	{
		if(count==index)
		{
			prev.next=current.next;
			System.out.println("node deleted at index "+index);
			break;
		}
		else
		{
			prev=current;
			current=current.next;
			count++;
		}
	}
	if(current==null)
	{
		System.out.println("node not found at index "+index);
	}

 return li;
}
public static void displayforw(ddll li)
{
   Node tail=li.head;
	while(tail!=null)
	{
   	System.out.println(tail.data);
   	tail=tail.next;
   }

}
public static void displaybackw(ddll li)
{

}

public static void main(String[] args) {
	int x=0;
	ddll li=new ddll();
	Scanner sc=new Scanner(System.in);
	int i=0;
	try
	{
	while(x==1)
	{
		int op=sc.nextInt();
		switch(op)
		{
              case 1:
              {
              	for(i=0;i<4;i++)
              	{
              		int d=sc.nextInt();
              addend(li,d);
                }
                break;
                
              }
              case 2:
              {
              	int a=0;
              	while(a==1)
              	{
              	 System.out.println("enter option");
              	 int op1=sc.nextInt();
              	   switch(op1)
              	   {
              	    case 1:
              	    deletebeg(li);
              	    break;
                    case 2:
                    deleteend(li);
                    break;
                    case 3:
                	int index=sc.nextInt();
                    deletebyindex(li,index);
                    break;

                    default:
                    a=0;
                   }
                
               } 
               break;
           }
              case 3:
              {
              	int a1=0;
              	while(a1==1)
              	{
              		System.out.println("enter option");
              		int op2=sc.nextInt();
                  switch(op2)
                  {
                   case 1:
                     displayforw(li);
                     break;
                   case 2:
                    displaybackw(li);
                    break;
                   default:
                    a1=0;
                  }
                }
                break;
              }
            
              default:
              x=0;
        }


		}
	}
	catch(Exception e)
	{
	System.out.println("linkedlist not present"+e);
    }
}
}
	