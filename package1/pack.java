import Graphics.circle;
import Graphics.square;
import Graphics.rectangle;
import Graphics.triangle;
import java.util.Scanner;
public class pack
{
	public static void main(String args[])
	{
		int opt;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n MENU \n 1.CIRCLE \n 2.RECTANGLE \n 3.TRIANGLE \n 4.SQUARE ");
		System.out.println("\n Choose an option: ");
		opt=sc.nextInt();
		switch(opt)
		{
			case 1:
			circle c=new circle();
			c.area();
			break;
			case 2:
			rectangle re=new rectangle();
			re.area();;
			break;
            case 3:
			triangle tr=new triangle();
			tr.area();;
			break;
            case 4:
			square sq=new square();
			sq.area();;
			break;
			default:
			System.out.println("Invalid Option");
		}
	}
}