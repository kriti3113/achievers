import java.util.Scanner;
class minchocolate
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of array elements");
		int n=sc.nextInt();
		int arr[]=new int[n];

		int i=0,j=0;	
		System.out.println("Enter the elements of array");
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter the value of m");
		int m=sc.nextInt();
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int count=0;
		int curr_diff=0,diff=9999;
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
			count++;
			if(count==m-1)
			{
				curr_diff=arr[j]-arr[i];
				if(diff>curr_diff)
					diff=curr_diff;
			}
			curr_diff=0;
		  }
		}
		System.out.println("Minimum diff is "+diff);
	}}