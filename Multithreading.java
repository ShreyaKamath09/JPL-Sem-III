import java.util.*;

class Mythread1 extends Thread
{
	public void run()
	{
		int i;
		for(i=1; i<11; i++)
		{
			System.out.println("49*"+ i +"="+ 49*i);
		try
		{
			Thread.sleep(100);
		}
		catch(InterruptedException e)
		{
			throw new RuntimeException(e);
		}
		}
	}
}

class Mythread2 extends Thread
{
	public void run()
	{
		char c;
		
		for(c = 'A'; c<= 'Z'; ++c)
		{
			System.out.println(c);
		    try
			{
				Thread.sleep(100);
		    }
		     catch(InterruptedException e)
		    {
			throw new RuntimeException(e);
		    }
		}
	}
}

public class Multithreading
{
	public static void main(String[] args)
	{
		Mythread1 obj1 = new Mythread1();
		Mythread2 obj2 = new Mythread2();
		
		obj1.start();
		obj2.start();
	}
}