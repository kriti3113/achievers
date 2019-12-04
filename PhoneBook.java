import java.util.*;
 class PhoneBook
{
  HashMap<String,String> h=new HashMap<String,String>();
	public void pnumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<size;i++)
		{

			System.out.println("Enter name:");
			String name=sc.nextLine();
			System.out.println("Enter the Phone number:");
			String phone=sc.nextLine();
			h.put(name, phone);
		}

		while(sc.hasNext())
		{
			String name=sc.nextLine();
			if(h.get(name)!=null)
			{
				System.out.println(name+" => "+h.get(name));
			}
			else
			{
				System.out.println("Not found");
			}
		}
	}
	public static void main(String args[])
	{
		PhoneBook pb=new PhoneBook();
		pb.pnumber();
	}
}