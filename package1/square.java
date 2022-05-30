package Graphics;
import java.util.Scanner;
public class square implements result
{
	Scanner sc=new Scanner(System.in);
	float a,ar;
	public void area()
	{
		System.out.println("Enter Radius");
		a=sc.nextFloat();
		ar=a*a;
		System.out.println("Area of square is: "+ar);
	}
}