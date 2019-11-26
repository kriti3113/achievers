import java.util.Scanner;
class sumfromtwoarrays
{
	public static void sumfromboth(int arr[],int arr1[],int n,int m,int x)
	{
		int i=0,j=0;
		int sum=0;
		for(i=0;i<n;i++)
		{
			sum=0;
			for(j=0;j<m;j++)
			{
				sum=0;
					sum=arr[i]+arr1[j];
					if(sum==x)
					{
						System.out.println(arr[i]+" "+arr1[j]);
					}

			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0,j=0;
		System.out.println("Enter the first array size");
		int n=sc.nextInt();
		System.out.println("Enter the second array size");
		int m=sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[m];
		System.out.println("Enter the value of x");
		int x=sc.nextInt();
		System.out.println("Enter the first array elements");
         for(i=0;i<n;i++)
         	arr[i]=sc.nextInt();
         System.out.println("Enter the second array elements");
         for(i=0;i<n;i++)
         	arr1[i]=sc.nextInt();
         sumfromboth(arr,arr1,n,m,x);
	
	}
}