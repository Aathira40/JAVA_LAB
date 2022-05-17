import java.util.Scanner;
class employee 
{
    int empid,salary;
    String name,address;
    employee()
    {
         super();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter empid");
        empid=sc.nextInt();
        System.out.println("enter name");
        name=sc.next();
        System.out.println("enter salary");
        salary=sc.nextInt();
        System.out.println("enter address");
        address=sc.next();
        System.out.println();
    }
}
class teacher extends employee
{
    String subject,department;
    teacher()
    {
        super();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter subject");
        subject=sc.next();
        System.out.println("enter department");
        department=sc.next();
        System.out.println();
    }
    void display()
    {

        System.out.println(" empid-"+empid);
        System.out.println(" name-"+name);
        System.out.println(" address-"+address);
        System.out.println(" salary-"+salary);
        System.out.println(" subject-"+subject);
        System.out.println(" department-"+department);
        System.out.println();
    }
}
 public class inherit{
     public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of teachers");
        n=sc.nextInt();
        teacher t[]=new teacher[n];
        for(int i=0;i<n;i++)
         t[i]=new teacher();   
        for(int i=0;i<n;i++)
            t[i].display();
    }
}