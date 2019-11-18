import java.util.Scanner;
class ArrayFrequency
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
		int max=-9999;
		for(i=0;i<n;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		int count[]=new int[max+1];
		for(i=0;i<n;i++)
	        count[arr[i]]++;
		System.out.println("frequency of given elements of array is");
		for(i=0;i<n;i++)
		{
                 if(count[arr[i]]!=0)
                 {
			System.out.println("frequency of "+arr[i]+" is "+count[arr[i]]);
			   count[arr[i]]=0;
	          }	
		}
	}
}
