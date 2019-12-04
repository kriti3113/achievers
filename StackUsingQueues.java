import java.util.*;
class StackUsingQueues
{
		static Queue q1=new LinkedList<Integer>();
		static Queue q2=new LinkedList<Integer>();
	
		public static void push1(int x)
		{
		
			while(!q1.isEmpty())
			{
				q2.add(q1.poll());
			}
			q1.add(x);
			while(!q1.isEmpty())
			{
				q1.add(q2.poll());
			}
		}
		public static void pop()
		{
			if(q1.isEmpty())
				return;
			q1.poll();
			
		}
		public static void display()
		{
			System.out.println("Stack implemented from queue is "+q1);
		}
	public static void main(String args[])
	{
	StackUsingQueues q=new StackUsingQueues();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			int data=sc.nextInt();
			q.push1(data);
		}
		pop();
		display();
	}

}