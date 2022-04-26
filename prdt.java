import java.util.Scanner;
class product{
    Scanner sc=new Scanner(System.in);
    int pcode,price;
    String pname;
    void get()
    {
        System.out.println("enter code");
        pcode=sc.nextInt();
        System.out.println("enter price");
        price=sc.nextInt();
        System.out.println("enter name");
        pname=sc.next();
     }
    void display()
    {
    System.out.println("pcode: "+pcode);
    System.out.println("price: "+price);
    System.out.println("pname: "+pname);
    }
}
class prdt{
    public static void main(String args[]){
        product p1=new product();
        product p2=new product();
        product p3=new product();
        System.out.println("enter first prdt:");
        p1.get();
        System.out.println("enter second prdt:");
        p2.get();
        System.out.println("enter three prdt:");
        p3.get();
        System.out.println(" product with lowest price:");
		if(p1.price<p2.price && p1.price<p3.price )
		{
			p1.display();
		}
		else if(p2.price<p3.price)
		{
			p2.display();
		}
		else
		{
			p3.display();
		}

    }
}
    