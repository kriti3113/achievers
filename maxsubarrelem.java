import java.util.Scanner;
class maxsubarrelem
{
public static void subarray(int arr[],int n,int start,int end,int k)
{
	int count=0;
	if(end==n)
		return;
	else if(start>end)
		subarray(arr,n,0,end+1,k);
	else
	{
		int n=arr.length;
		int j=0;
		max=-9999;
		for(int i=start;i<=end;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
         }
		if(max>k)
		{
			count++;
		}
	subarray(arr,n,start+1,end,k);

   }
   System.out.println("There are "+count+"maximum elements greater than k");
   return;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the array elements");
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	System.out.println("Enter the value of k");
	int k=sc.nextInt();
	subarray(arr,n,0,0,k);

}}