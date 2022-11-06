import java.util.*;

public class ExceptionHandling
{
    public static void main(String[] args)
    {
        try //specifies a block where exception occurs
        {
            int a[] = new int[5];
            int b=4/0;
            a[10]=7;
        }
        catch(ArithmeticException e) //used to handle exception
        {
            System.out.println("Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index out of Bounds");
        }
        finally //used to execute necessary required code
        {
            System.out.println("Exceptions Handled");
        }
    }
}