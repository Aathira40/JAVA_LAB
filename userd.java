import java.util.Scanner;

 class userd extends Exception{
     public userd(String str)
     {
         super(str);
     }
 }
 class checkup
 {
     void get() throws userd{
   Scanner sc=new Scanner(System.in);
   String username="sng21";
   int passwd=12345;
   String usern;
   int pass;
   System.out.println("enter username");
   usern=sc.next();
   System.out.println("enter password");
   pass=sc.nextInt();
   try{
   if(usern.equals(username) && pass==passwd)
   
   {
       System.out.println("successfully entered");
   }
   else
   {
       throw new userd("incorrect");
   }
   }
   catch(Exception e)
   {
       System.out.println("error occured");
   }
 }
 } 