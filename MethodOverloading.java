import java.util.*;
import java.lang.String.*;
// method overloading
public class MethodOverloading {
    int addnum( int a, int b)
    {
        return (a+b);
    }
    double addnum(double a, double b)
    {
        return (a+b);
    }
    String addnum(String a, String b)
    {
        return (a+b);
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        /*System.out.println("Enter a number: ");
        int n1= sc.nextInt();
        System.out.println("Enter another number: ");
        int n2= sc.nextInt();*/

        MethodOverloading fn = new MethodOverloading();

        System.out.println("The sum is "+fn.addnum(2, 8));
        System.out.println("The sum is "+fn.addnum(2.95, 8.45));
        System.out.println("The sum is "+fn.addnum(shreya, kamath));


    }
}