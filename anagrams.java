import java.util.Scanner;
class abc
{
	public static void tochkanagram(String str,String s)
	{
		str=str.toLowerCase();
		s=s.toLowerCase();
		char arr[]=str.toCharArray();
		char arr1[]=s.toCharArray();
		int count=0;
		if(arr.length!=arr1.length)
			System.out.println("Not Anagrams");
		else
		{
            for(int i=0;i<arr.length-1;i++)
            {
      	      for(int j=0;j<arr1.length-1;j++)
      	      {
      		    if(arr[i]==arr1[j])
      		    {
      		    	count++;
      		    }
      	        if(j==arr.length-1&&arr[i]!=arr1[j])
      			break;
      	      }
            }
        }
      if(count-1==arr.length)
     System.out.println("Anagrams");

      
	}
	public static void main(String[] args) {
		String str=new String();
		String s=new String();
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		s=sc.next();
        tochkanagram(str,s);

	}
}