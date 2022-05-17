import java.util.Scanner;
class person{
    String name,gender;
    int age;
    String address;
    person()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter name");
    name=sc.next();
    System.out.println("enter gender");
    gender=sc.next();
    System.out.println("enter age");
    age=sc.nextInt();
    System.out.println("enter address");
    address=sc.next();
    System.out.println();
}
}
class employee extends person
{
    int empid,salary;
    String compname,quali;
    employee()
    {
         super();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter empid");
        empid=sc.nextInt();
        System.out.println("enter salary");
        salary=sc.nextInt();
        System.out.println("enter companyname");
        compname=sc.next();
        System.out.println("enter qualification");
        quali=sc.next();
        System.out.println();
    }
}
class teacher extends employee
{
    String subject,department;
    int tchid;
    teacher()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter subject");
        subject=sc.next();
        System.out.println("enter department");
        department=sc.next();
        System.out.println("enter teacherid");
        tchid=sc.nextInt();
        System.out.println();
    }
    void display()
    {
        System.out.println("name-"+name);
        System.out.println(" gender-"+gender);
        System.out.println(" age-"+age);
        System.out.println(" address-"+address);
        System.out.println(" empid-"+empid);
        System.out.println(" salary-"+salary);
        System.out.println(" companyname-"+compname);
        System.out.println(" qualification-"+quali);
        System.out.println(" subject-"+subject);
        System.out.println(" department-"+department);
        System.out.println(" teacherid-"+tchid);
        System.out.println();
    }
}
 public class inheritance{
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