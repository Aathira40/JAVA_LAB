package mathre;
import java.util.Scanner;
 public class mul implements res
{
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	public void resul()
	{
		System.out.println("Enter 1 number");
		a=sc.nextInt();
        System.out.println("Enter 2 number");
        b=sc.nextInt();
		c=a*b;
		System.out.println("multiplication of 2 numbers: "+c);
	}
}