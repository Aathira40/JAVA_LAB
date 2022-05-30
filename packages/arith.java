import mathre.add;
import mathre.sub;
import mathre.mul;
import mathre.di;
import mathre.res;
import java.util.Scanner;
public class arith
{
	public static void main(String args[])
	{
		int opt;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n MENU \n 1.addition \n 2.subtraction \n 3.multiplication \n 4.division");
		System.out.println("\n Choose an option: ");
		opt=sc.nextInt();
		switch(opt)
		{
			case 1:
			add c=new add();
			c.resul();
			break;
			case 2:
			sub s=new sub();
			s.resul();
			break;
			case 3:
			mul m=new mul();
            m.resul();
			break;
            case 4:
			di d=new di();
            d.resul();
			break;
			default:
			System.out.println("Invalid Option");
		}
	}
}