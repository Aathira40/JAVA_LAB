import java.util.Scanner;

class even implements Runnable{
    public void run()
    {
        int n;
      Scanner s = new Scanner(System.in);
      System.out.print("Enter a Number: ");
      n = s.nextInt();
      for(int i=2; i<n; i++)
      {
          if(i%2==0)
			{
          System.out.println(" even numbers are:"+i);
           System.out.println("\n" );
         }
      }
    
}
}
   

class fib implements Runnable
{
	int n,a=0,b=1,c=0,i=0;
	Scanner sn=new Scanner(System.in);
	public void run()
	{
		System.out.println("Enter a number:");
		n=sn.nextInt();
		System.out.println("Fibonacci series:");
		while(i<n)
		{
			
			
			System.out.print(" "+c);
			c=a+b;
			a=b;
			b=c;
			i++;
		}
		
    }
}
  

public class runint{
    public static void main(String args[]){
        even e1 = new even();
        fib f1 = new fib();

        Thread m2 = new Thread(e1);
        Thread m1 = new Thread(f1);
        
        Scanner sc = new Scanner(System.in);
 
        m2.start();
        m1.start();
 
}
}