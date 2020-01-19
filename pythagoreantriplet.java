import java.util.*;
class abc
{
	public static boolean pythagoreantrip(int n,int arr[])
	{
      

		for (int i = 0; i < n; i++) 
			arr[i] = arr[i] * arr[i]; 
		Arrays.sort(arr); 
		for (int i = n - 1; i >= 2; i--) { 
			int l = 0; 
			int r = i - 1;
			while (l < r) { 
				if (arr[l] + arr[r] == arr[i]) 
					return true; 

				if (arr[l] + arr[r] < arr[i]) 
					l++; 
				else
					r--; 
			} 
		} 

		return false; 
	} 


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
        int i=0;
		for(i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int arr[]=new int[n];
			for( i=0;i<n;i++)
			arr[i]=sc.nextInt();
		boolean b1=pythagoreantrip(n,arr);
		//if(b1==true)
			System.out.println(b1);
		}
		
	}}
