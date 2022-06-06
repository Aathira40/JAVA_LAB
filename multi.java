import java.util.Scanner;

class prime extends Thread{
    public void run()
    {
        int n,c;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter a Number: ");
      n = s.nextInt();
      for(int i=2; i<n; i++)
      {
         c=0;
        for(int j=1;j<=i;j++)
         {
            
            if(i%j==0)
            {
                c++;
            }
         }
          if(c==2)
          System.out.println(" prime numbers are"+i);
           
         }
      }
    
}
   

class table extends Thread{
    public void run(){
        
        for(int i=1;i<10;i++)
        {
            System.out.println("5x"+i+"="+(i*5));
        }

    }
}

  

public class multi{
    public static void main(String args[]){
        prime p1 = new prime();
        table t1 = new table();

        Thread m2 = new Thread(p1);
        Thread m1 = new Thread(t1);
        
        Scanner sc = new Scanner(System.in);
 
        p1.start();
        t1.start();
 
}
}
