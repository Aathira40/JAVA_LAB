import java.util.Scanner;

class cpu
{
Scanner sc=new Scanner(System.in);
int price;

void getcpu()
{
System.out.println("\nEnter the price of cpu:");
price=sc.nextInt();
} 

class processor 
{
int core;
String manufacturer;

void getprocessor()
{
System.out.println("Enter the no of cores of processor:");
core=sc.nextInt();
System.out.println("Enter the manufacturer of processor");
manufacturer=sc.next();
}

void putprocessor()
{
System.out.println("No of cores of processor:"+core);
System.out.println("Manufacturer of processor"+manufacturer);
}

}	

static class ram
{
int memory;
String manuf;
Scanner sc=new Scanner(System.in);
void getram()
{
System.out.println("Enter the memory size of ram:");
memory=sc.nextInt();
System.out.println("Enter the manufacturer of ram");
manuf=sc.next();
}
void putram()
{
System.out.println("Memory size of ram:"+memory);
System.out.println("Manufacturer of ram:"+manuf);
}

}

}


public class comp {
public static void main(String args[])
{
cpu c=new cpu();
cpu.processor p=c.new processor();
cpu.ram r=new cpu.ram();

c.getcpu();
p.getprocessor();
r.getram();

System.out.println("\nDetails");
 p.putprocessor();
 r.putram();
}

}