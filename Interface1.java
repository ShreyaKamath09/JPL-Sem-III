import java.util.*;

interface A
{
	void a();
	void b();
}
interface B
{
	void c();
	void d();
}

public class Interface1 implements A,B
{
	public void a()
	{
		System.out.println("This is method a from interface A");
	}
	public void b()
	{
		System.out.println("This is method b from interface A");
	}
	public void c()
	{
		System.out.println("This is method c from interface B");
	}
	public void d()
	{
		System.out.println("This is method d from interface B");
	}
	public static void main(String[] args)
	{
		Interface1 obj = new Interface1();
		
		obj.a();   obj.b();
		obj.c();   obj.d();
	}
}