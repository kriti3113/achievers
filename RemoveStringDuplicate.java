import java.util.Scanner;
class RemoveStringDuplicate
{
	public static String remdup(String str)
	{
		char arr[]=str.toCharArray();
                 
		int count=0;
		int f=0,j=0;
		char d[]=new char[100];
      for(int i=0;i<str.length()-1;i++)
	 {
        if(arr[i]!=arr[i+1])
        {
        d[j]=arr[i];
        j++;
        }
     }
      d[j]=arr[str.length()-1];
     String v=new String(d);
     return v;
     
  }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
//System.out.println(str);
		String f=remdup(str);
		System.out.print(f);
	}}