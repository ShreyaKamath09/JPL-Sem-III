import java.util.*;

public class Arithmetic
{
  public static void main(String[] args)
  {
    int a,b;
	Scanner sc = new Scanner (System.in);
	
    System.out.println("Enter the first number: ");
	a = sc.nextInt();
	
	System.out.println("Enter the second number: ");
	b = sc.nextInt();
	
	System.out.println("Addition is: "+ (a+b));
	System.out.println("Subtraction is: "+ (a-b));
	System.out.println("Multiplication is: "+ (a*b));
	System.out.println("Division is: "+ (a/b));
	System.out.println("Remainder (modulus) is: "+ (a%b));
	
	}
}
	
	