import java.util.Scanner;
class abc
{
	public static String chkparenthesis(char arr[])
	{
      Stack<Character> stack = new Stack<Character>();
	 for(int i=0;i<arr.length;i++)
	  {
           if(arr[i]=='{'||arr[i]=='('||arr[i]=='[')
			stack.push(arr[i]);
	   if (arr[i]=='}'||arr[i]==')'||arr[i]== ']')
            {
            if(!stack.isEmpty())
	      {
              char n=stack.peek();
              if (arr[i]== '}'&&n =='{'||arr[i]== ')'&&n =='('||
             	arr[i]== ']'&&n== '[')
                 stack.pop();
              else 
                return "Not Balanced";
              }
	    }
         }
     if(stack.isEmpty())
     	return "Balanced";
     else
     	return "Not Balanced";
 }
	
	public static void main(String[] args) {
		String s=new String();
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		char arr[]=s.toCharArray();
         String f=chkparenthesis(arr);
         System.out.println("string is "+f);
		}
}
