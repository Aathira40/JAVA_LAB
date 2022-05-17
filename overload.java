import java.util.Scanner;
class overload{
    public static void main(String args[]){
    area a1=new area();
     a1.finda(5.2);
     a1.finda(2);
     a1.finda(4,6);
     a1.finda(1.1,3.2);
    }
}
class area{
    void finda(double r)
    {
        double c=3.14*r*r;
    System.out.println("area of circle =" +c);
     }
     
    void finda(int l,int b)
    {
         System.out.println("area of triangle ="+((l+b)/2));
     }
     void finda(int a)
     {
         System.out.println("area of square is =" +a*a);
     }
    
     void finda(double l,double b)
    {
         System.out.println("area of rectangle ="+l*b);
     }
}
