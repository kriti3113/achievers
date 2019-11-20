import java.util.Scanner;
class Node
{
  int data;
  Node left,right;
  Node(int d)
  {
    data=d;
    left=right=null;
  }
}
class chkbst
{
  static Node root;
  chkbst()
  {
    root=null;
  }
public static boolean chkb(Node root,Node prev)
{
  if(root!=null)
 {
  if(root.left!=null)
   {
  chkb(root.left,root);
  if(root.left.data>root.data)
    {
    return false;
    }
  }
 if(root.right!=null)
  {
  chkb(root.right,root);
  if(root.right.data<root.data)
   {
    return false;
   }
  }
}
  return true;
}
public static void main(String[] args) {
  chkbst b=new chkbst();
  Scanner sc=new Scanner(System.in);
  
  root = new Node(19); 
    root.left = new Node(8); 
    root.left.left = new Node(7); 
    root.right = new Node(22); 
    root.right.left = new Node(21); 
    root.right.right = new Node(25);
    //preOrder(root);
  boolean c=chkb(root,null);
  if(c==true)
  {
    System.out.println("The given tree is a bst");
  }
  else
  {
    System.out.println("The given tree is not a bst");
  }
}}

    
