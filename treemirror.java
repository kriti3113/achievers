import java.util.Scanner;
class Node {

	int key;
	Node left;
	Node right;

	Node(int d) {
		key = d;
		left = right = null;
	}
}
 class CheckMirrorTree
{
	static Node root=null;
	CheckMirrorTree(int data)
	{
		root=new Node(data);
	}
	public static boolean check(Node root)
	{
		return checkmirror(root,root);
	}
	public static boolean checkmirror(Node root1,Node root2)
	{
		if(root1==null && root2==null)
		{
			return true;
		}
		if(root1!=null && root2!=null && root1.key==root2.key)
		{
			return(checkmirror(root1.left,root2.right)&&checkmirror(root1.right,root2.left));
		}
		return false;
	}
		public static void main(String[] args) {
			CheckMirrorTree tree=new  CheckMirrorTree(1);
				tree.root.left=new Node(2);
				tree.root.right=new Node(2);
				tree.root.left.left=new Node(3);
				tree.root.left.right=new Node(4);
				tree.root.right.left=new Node(4);
				tree.root.right.right=new Node(3);
	            tree.root.left.left.left=new Node(5);
				tree.root.left.left.right=new Node(6);
				tree.root.left.right.left=new Node(7);
				tree.root.left.right.right=new Node(8);
				tree.root.right.left.left=new Node(8);
				tree.root.right.left.right=new Node(7);
				tree.root.right.right.left=new Node(6);
				tree.root.right.right.right=new Node(5);
				boolean c=check(root);
				System.out.println(c);			
				
		}
}

