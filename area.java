import java.util.Scanner;

class area{
    public static void main(String args[]){
    circle a1=new circle();
    System.out.println("enter radius");
    Scanner sc=new Scanner(System.in);
    a1.r=sc.nextInt();
    a1.ar();
    a1.peri();
    a1.display();
}
}
class  circle{
    int r;
    float ar,peri;

    void ar()
    {
         ar=(float)(3.14*r*r);
    }
    void peri()
    {
         peri=(float)(2*3.14*r);
    }
    void display()
    {
        System.out.println("area="+ar);
        System.out.println("peri="+peri);
    }
}
