import java.util.Scanner;
class maxsubarrelem
{
	static int count=0;
public static int subarray(int arr[],int n,int start,int end,int k)
{
	
	if(end==n)
		return 0;
	else if(start>end)
		subarray(arr,n,0,end+1,k);
	else
	{
		int j=0;
		int max=-9999;
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
   
   return count;
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
	int count1=subarray(arr,n,0,0,k);
	System.out.println("There are "+count1+" maximum elements greater than k");

}}