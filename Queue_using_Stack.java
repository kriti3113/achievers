import java.util.*;
 class Queue_using_Stack {
static Node top;
static Node top1;
 static class Node
{
int data;
Node next;
Node(int d)
{
data=d;
}
}
Queue_using_Stack()
{
top=null;
top1=null;
}
public void push1(int data)
{
Node newnode= new Node(data);
//newnode.data=data;
newnode.next=top;
top=newnode;
}
public void push2(int data)
{
Node newnode= new Node(data);
//newnode.data=data;
newnode.next=top1;
top1=newnode;
}

public void pop()
{
Node temp=top;
while(temp!=null)
{
push2(temp.data);
temp=temp.next;
}


}
public void display()
{
	System.out.println("Elements of stack");
	Node temp=top;
while(temp!=null)
{
System.out.println(temp.data);
temp=temp.next;
}
System.out.println("Elements of Queue using two Stacks");
Node temp1=top1;
while(temp1!=null)
{
System.out.println(temp1.data);
temp1=temp1.next;
}
Node temp2=top1;
while(temp2!=null)
{
	Node z=temp2.next;
	temp2.next=null;
	temp2=z;
}
}
public static void main(String args[])
{
Queue_using_Stack a=new Queue_using_Stack ();
a.push1(1);
a.push1(2);
a.push1(3);
a.push1(4);
a.pop();
a.display();
}
}

