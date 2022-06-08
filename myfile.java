import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
public class myfile
{
    public static void main(String args[])
    {
        
        
        try
        {
            FileWriter w=new FileWriter("myfile.txt");
            w.write("hi\nmy name\n");

            w.close();
            System.out.println("Done"); 

               File myob=new File("myfile.txt");
              Scanner sc=new Scanner(myob);
             while(sc.hasNextLine()){

                  
                String data=sc.nextLine();
                System.out.println(data);
             }
            sc.close();
        }
        catch(IOException e)
        {
            System.out.println("will overwrite"+e);
        }
    }
}
