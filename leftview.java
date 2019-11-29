import java.util.Scanner;
class leftview
{
	static Node root;
	 static int count=0;
	 //static int count1=0;
	static class Node
	{
		Node left,right;
		int data;
		Node(int data)
		{
			this.data=data;
			left=null;
			right=null;
		}
	}
  
	public static void leftviewprint(Node root,int level)
	{
			if(root!=null)
			{
				if(level>count)
				{
					//System.out.println("hk");
				System.out.println(root.data);
				count=level;
			     }
				leftviewprint(root.left,level+1);
			     leftviewprint(root.right,level+1);
			}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 leftview l=new leftview();
		root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
	    root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.right=new Node(6);
		root.left.right.left=new Node(7);
		root.left.right.left.right=new Node(8);
		//System.out.println(root.data);
		leftviewprint(root,1);
	}
}