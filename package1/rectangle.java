package Graphics;
import java.util.Scanner;
public class rectangle implements result
{
	int l,b,ar;
	Scanner sc=new Scanner(System.in);
	public void area()
	{
		System.out.println("Enter Length of rectangle:");
		l=sc.nextInt();
		System.out.println("Enter Breadth of rectangle:");
		b=sc.nextInt();
		ar=l*b;
		System.out.println("Area of Rectangle is: "+ar);
	}

}	