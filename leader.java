import java.util.Scanner;
class abc
{
	public static void lleader(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int s=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				if(s<arr[j])
				{
					break;
				}
			    if(s>arr[j]&&j==arr.length-1)
			    {
			    	System.out.print(s+" ");
			    }
			}
		}
		System.out.print(arr[arr.length-1]);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		lleader(arr);
	}
}