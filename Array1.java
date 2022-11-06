import java.util.*;

public class Array1
{
	public static void main(String[] args)
	{
		int row,col;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows in matrix:");
		row = sc.nextInt();
		
		System.out.println("Enter number of columns in matrix:");
		col = sc.nextInt();
		
		int a[][] = new int[row][col];
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.println("Enter elements of matrix:");
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Entered matrix:");
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.println("\t"+a[i][j]);
			}
			System.out.println("\n");
		}
	}
}