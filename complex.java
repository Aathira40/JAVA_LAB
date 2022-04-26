import java.util.Scanner;
class complex{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    com a1=new com();
    com b1=new com();
    System.out.println("enter 1 complex number");
    a1.add();
    System.out.println("enter 2 complex number");
    b1.add();
    int r1,i1;
    r1=a1.a+b1.a;
    i1=a1.b+b1.b;
    System.out.println("complex 1:"+a1.a+"+"+a1.b+"i");
    System.out.println("complex 2:"+b1.a+"+"+b1.b+"i");
    System.out.println("Addition of complex nos="+r1+"+"+i1+"i");

    }
}
class com{
       int a,b;
       void add()
    {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter real no");
       a=sc.nextInt();
       System.out.println("enter imaginary no");
       b=sc.nextInt();
     }
}