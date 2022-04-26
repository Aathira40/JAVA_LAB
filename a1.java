import java.util.Scanner;
public class a1
{
	public static void main(String args[])
	{
		System.out.println("enter the limit");
		Scanner sc=new Scanner(System.in);
		int a[]=new int[20],n,i,s,count=0;
		n=sc.nextInt();
		System.out.println("enter elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter elements to be searched");
		s=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==s)
			{
				count=1;	
				break;
			}
			else
			{
				count=0;	
			}
		}
		if(count==1)
		{
			System.out.println("element found");
		}
        else
        {
			System.out.println("element not found");
		}
	}   
                                 
}