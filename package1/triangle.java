package Graphics;
import java.util.Scanner;
public class triangle implements result
{
	int l,b;
    float ar;
	Scanner sc=new Scanner(System.in);
	public void area()
	{
		System.out.println("Enter Length of triangle:");
		l=sc.nextInt();
		System.out.println("Enter Breadth of triangle:");
		b=sc.nextInt();
		ar=((l*b)/2);
		System.out.println("Area of triangle is: "+ar);
	}
}