import java.util.Scanner;
class abc
{
	public static void main(String[] args) {
		String s=new String();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of string");
				s=sc.next();
				int n=s.length();
				char str[]=s.toCharArray();
				int i=0,j=0;
				for(i=0,j=n-1;i<j;i++,j--)
				{
                  if(str[i]>=32&&str[i]<=47||str[i]>=58&&str[i]<=64||str[i]>=91
                  	&&str[i]<=96||str[i]>=123&&str[i]<=126)
                  {
                  	i++;
                  }
                 if(str[i]>=32&&str[i]<=47||str[i]>=58&&str[i]<=64||str[i]>=91
                  	&&str[i]<=96||str[i]>=123&&str[i]<=126)
                  {
                  	j--;
                  }
                  char temp=str[i];
                  str[i]=str[j];
                  str[j]=temp;
				}
				System.out.println("required string is ");
				for(i=0;i<str.length;i++)
				System.out.print(str[i]);
	}
}
