import java.util.*;

public class PascalTriangle
{
    public int fact(int x)
    {
        if (x==0)
        {
            return 1;
        }
        else
            return x*fact(x-1);

    }

    public static void main(String[] args)
    {
        int n,i,j,k;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        n = sc.nextInt();

        PascalTriangle obj = new PascalTriangle();

        for(i=0; i<n; i++)
        {
            for(j=0; j<=n-i; j++)
            {
                System.out.print(" ");
            }
                for (j = 0; j<=i; j++)
                {
                    System.out.print("  " + obj.fact(i) / (obj.fact(i - j) * obj.fact(j)));
                }
            System.out.println("\r\n");
        }
    }
}
		
	