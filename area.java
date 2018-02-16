import java.util.*;

interface shape
{
	public void area();
	public void perimeter();
	public void setValue1(int l1);
	public void setValue2(int b1);
	public double getValue1();
}

abstract class shape1
{
	int d1,d2,d3;
}

class rectangle extends shape1 implements shape
{
	public void setValue1(int l1)
	{
		this.d1=l1;
	}

	public void setValue2(int b1)
	{
		this.d2=b1;
	}

	public double getValue1()
	{
		return d1;
	}

	public double getValue2()
	{
		return d2;
	}

	public void area()
	{
		double a1=d1*d2;
		System.out.println("the area of rectangle is " +a1);
		System.out.println();
	}

	public void perimeter()
	{
		double p1=d1+d2;
		System.out.println("the perimeter of rectangle is " +p1);
		System.out.println();
	}
}

class Triangle extends shape1 implements shape
{
	public void setValue1(int l)
	{
		this.d1=l;
	}

	public void setValue2(int b)
	{
		this.d2=b;
	}

	public double getValue1()
	{
		return d1;
	}

	public double getValue2()
	{
		return d2;
	}

	public void area()
	{
		double a=0.5*d1*d2;
		System.out.println("the area of triangle is " +a);
		System.out.println();
	}

	public void perimeter()
	{
		double p=d1+d2;
		System.out.println("the perimeter of triangle is " +p);
		System.out.println();
	}
}

class area
{
	public static void main(String args[])
	{
		Triangle t=new Triangle();
		rectangle r=new rectangle();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length for triangle");
		System.out.println();
		int d1=scan.nextInt();
		System.out.println();

		System.out.println("enter the breadth for triangle");
		System.out.println();
		int d2=scan.nextInt();
		System.out.println();

		t.setValue1(d1);
		t.setValue2(d2);

		t.getValue1();
		t.getValue2();

		t.area();
		t.perimeter();

		System.out.println("enter the lenght for rectangle");
		System.out.println();
		int d3=scan.nextInt();
		System.out.println();

		System.out.println("enter the breadth for rectangle");
		System.out.println();
		int d4=scan.nextInt();
		System.out.println();
		
		r.setValue1(d3);
		r.setValue2(d4);
		
		r.getValue1();
		r.getValue2();

		r.area();
		r.perimeter();
	}
}