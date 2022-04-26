import java.util.Scanner;
class matri
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size ");
        int n = in.nextInt();
        
        int a[][] = new int[n][n];
       
        System.out.println("Enter  the elements:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                a[i][j] = in.nextInt();
            }
        }
        
        
        System.out.println("Matrix is:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        
         System.out.println(" tranpose of Matrix is:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(a[j][i] + " ");
            }
            System.out.println("");
        }
        
        int f = 1; 
        
       
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if(a[i][j] != a[j][i])
                {
                    f = 0;
                    break;
                }
            }
        }
        
        if(f == 1)
            System.out.println(" Symmetric Matrix");
        else
            System.out.println("not Symmetric Matrix");
    }
}