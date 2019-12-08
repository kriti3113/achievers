import java.util.Scanner;
class printleafnodes
{
	static Node root;
	static class Node
	{
		Node left;
		Node right;
		int data;
		Node(int d)
		{
			left=null;
			right=null;
			data=d;
		}
	}
	public static void insert(int data)
	{
		root=insertroot(root,data);
	}
	public static Node insertroot(Node root,int data)
	{
		if(root==null)
		{
			 root=new Node(data);
			 return root;
		}
		if(data<root.data)
		{
			root.left=insertroot(root.left,data);
		}
         if(data>root.data)
		{
			root.right=insertroot(root.right,data);
		}
       return root;
	}
    public static void printlfnodes(Node root)
    {
    	if(root==null)
    		return;
        else if(root.left==null&&root.right==null)
    		System.out.print(root.data+" ");
    	else
    	{
    		printlfnodes(root.left);
    		printlfnodes(root.right);
    	}
    }
	public static void main(String[] args) {
		printleafnodes tree=new printleafnodes();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		System.out.println("Enter the elements of tree");
		for(int i=0;i<n;i++)
		{
			int data=sc.nextInt();
	       insert(data);
	    }
      printlfnodes(root);
	}
}
