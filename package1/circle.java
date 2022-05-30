package Graphics;
import java.util.Scanner;
public class circle implements result
{
	Scanner sc=new Scanner(System.in);
	double r,ar;
	public void area()
	{
		System.out.println("Enter Radius");
		r=sc.nextFloat();
		ar=3.14*r*r;
		System.out.println("Area of Circle is: "+ar);
	}

}