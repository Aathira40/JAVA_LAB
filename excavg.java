import java.util.Scanner;

 class userd extends Exception{
     public userd(String str)
     {
         super(str);
     }
 }
 class excavg
 {
     public static void main(String args[])
     {
         int sum=0,avg=0;
         int n,m;
       try{
           Scanner sc=new Scanner(System.in);
           System.out.println("enter a limit");
            n=sc.nextInt();
           System.out.println("enter a number");
           for(int i=0;i<n;i++)
           {
             m=sc.nextInt();
             if(m<0)
             {
                 throw new userd("negative number");
             }
             else
             {
                 sum=sum+m;
                 avg=sum/n;
           }
           
       }
       System.out.println("average="+avg);

       }
   catch(userd e)
   {
       System.out.println("error occured\n" +e);
       System.out.println("\n");
   }
 }
 }
  