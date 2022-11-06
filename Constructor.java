import java.util.*;

public class Constructor
{
  Constructor()
  {
    System.out.println("This is Default Constructor");
  }
  Constructor(int x, int y)
  {
   System.out.println("This is Parameterised Constructor");
   System.out.println("The parameters passed are" + x + "and" +y);
  }
  
  public static void main(String[] args)
  {
    Constructor obj1 = new Constructor();
	Constructor obj2 = new Constructor(5,9);
  }
}