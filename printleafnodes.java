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
	public static void printhighestlevel(Node root,int level)
	{
		if(root==null)
			return;
      if(level==1)
      	System.out.print(root.data+" ");
      else if(level>1)
      {
      	printhighestlevel(root.left,level-1);
      	printhighestlevel(root.right,level-1);
      }
	}

    public static int height(Node root)
    {
    	//int l=0,r=0;
    	if(root==null)
    		return 0;
        
        int l= height(root.left);
        int r= height(root.right);
       if(l>r)
       	return (1+l);
       else
       	return (1+r);
       
    }
	public static void main(String[] args) {
		printleafnodes p=new printleafnodes();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		System.out.println("Enter the elements of tree");
		for(int i=0;i<n;i++)
		{
			int data=sc.nextInt();
		p.insert(data);
	    }
		int h=height(root);
        printhighestlevel(root,h);
	}
}