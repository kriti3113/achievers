import java.util.Scanner;
class mergearraysort
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements of first array");
		int n=sc.nextInt();
		System.out.println("Enter the number of elements of second array");
		int m=sc.nextInt();
		int arr1[]=new int[n];
        int arr2[]=new int[n];
        int a[]=new int[n+m];
		int i=0,j=0;	
		System.out.println("Enter the elements of first array");
		for(i=0;i<n;i++)
			arr1[i]=sc.nextInt();
		System.out.println("Enter the elements of second array");
		for(i=0;i<n;i++)
			arr2[i]=sc.nextInt();
		for(i=0;i<n;i++)
			a[i]=arr1[i];
		int k=0;
		for(i=n;i<n+m;i++)
		{
			a[i]=arr2[k];
			k++;
		}
		for(i=0;i<(n+m)-1;i++)
		{
			for(j=i+1;j<n+m;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Merge sorted array is");
		for(i=0;i<m+n;i++)
		System.out.print(a[i]+" ");
}}