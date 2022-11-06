import java.sql.SQLOutput;
import java.util.*;

public class Inheritance
{
    void print1()
    {
        System.out.println("This is print1.");
    }
    void div(int x, int y)
    {
        System.out.println("Division is:"+ x/y);
    }
}
class Inheritance2 extends Inheritance
{
  void print2()
  {
      System.out.println("This is print2.");
  }
  void mult(int x,int y)
  {
      System.out.println("Multiplication is:"+ x*y);
  }
}
class test
{
    public static void main(String[] args)
    {
        Inheritance2 obj = new Inheritance2();
        obj.print1();
        obj.print2();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        System.out.println("Enter another number:");
        int b = sc.nextInt();

        obj.div(a,b);
        obj.mult(a,b);
    }
}