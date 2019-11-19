import java.util.*;
class sumsubarr
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println("Enter the number of elements");
	int arr[]=new int[n];
	System.out.println("Enter the array elements");
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	int count=0;
	int index=0;
     System.out.println("Enter the value of k");
	int h=sc.nextInt();
	int f=0;
	int a[]=new int[100];
	for(int i=0;i<n;i++)
	{
		for(int j=i;j<n;j++)
		{
			int sum=0;
			f=0;
			for(int k=i;k<=j;k++)
			{
				a[f]=k;
				f++;
				sum=sum+arr[k];

			}
			   if(sum==h)
				{
				System.out.println(a[0]+" "+a[f-1]);
				   count++;
				}
		}
	}
	         if(count==0)
		System.out.println("No such subarray found");
}
}
