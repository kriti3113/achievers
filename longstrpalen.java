import java.util.Scanner;
class Main
{
	public static int maxlenstr(String pallinarr[],int h)
   	{
   	int max=-9999;
   	int i=0;
   	int n=pallinarr.length;
   	for(i=0;i<h;i++)
   	{
   		if(pallinarr[i].length()>max)
   			max=pallinarr[i].length();
   	}
   	return max;
   }
   public static String maxsubstring(int max,String pallinarr[],int h)
     {
     	String maxstr=new String();
     	for(int i=0;i<h;i++)
     	{
     	if(pallinarr[i].length()==max)
     		 maxstr=pallinarr[i];
      }
     	return maxstr;
     }
       public static boolean chkpallindrome(String v)
        {
          String maxstr=new String();
          int flag=0;
            maxstr=v;
        	int i=0,j=maxstr.length()-1,k=0;
        	char a[]=maxstr.toCharArray();
            while(i<j)
     	      {
     		    char temp=a[i];
     		    a[i]=a[j];
     		    a[j]=temp;
     		    i++;
     		    j--;
     	      }
     	     String rev=new String(a);
        if(rev.equals(v))
          return true;
        else
          return false;
      }
   public static void main(String[] args) {
   	Scanner sc=new Scanner(System.in);
     System.out.println("Enter the value of string");
     String s=sc.next();
   	  String t=new String("");
   	//int f=0;
   	String str[]=new String[1000];
   	int i=0,j=0,k=0;
    int f=0;
   	for(i=0;i<s.length();i++)
   	{
   		for(j=i;j<s.length();j++)
   		{
   			t="";
   			for(k=i;k<=j;k++)
   			{
   				char c=s.charAt(k);
   				t=t+c;
   			}
   			str[f]=t;
   			f++;
   		}
   	}
   String pallinarr[]=new String[1000];
    int h=0;
    for(i=0;i<f;i++)
    {
   	boolean b=chkpallindrome(str[i]);
   	if(b==true)
     {
   		pallinarr[h]=str[i];
     h++;
     }
   }
   	int max=maxlenstr(pallinarr,h);
    String maxstr=maxsubstring(max,pallinarr,h);
    System.out.println("Longest pallindrome substring is "+maxstr);
     }
   }
   
