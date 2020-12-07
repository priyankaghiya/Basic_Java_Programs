abstract class Shape
{
	abstract void area();
}
abstract  class Circle extends Shape
{
	double pi=3.14;
	abstract void volume();	
	void area()
	{
		System.out.println("AREA OF CIRCLE IS : "+pi*10*10);
	}
}

class Cylinder extends Circle
{
	double pi=3.14,vol;
	void volume()
	{
		vol=((double)1/(double)3)*pi*3*3*5;
		System.out.println("VOLUME OF CYLINDER  IS : "+vol);
	}
}	

abstract class Polygon	extends Shape
{
	abstract void noOfSides();
}

abstract class Rect extends Polygon
{
	void noOfSides()
	{
		System.out.println("NO. OF SIDES OF RECTANGLE : 4");
	}
	void area()
	{
		System.out.println("AREA OF RECTANGLE : "+4*5);
	}
	abstract void volume();
}

class  Rect3d extends Rect
{
	void volume()
	{
		System.out.println("VOLUME OF RECTANGLE IS : "+4*5*10);
	}
}

class Triangle extends Polygon
{
	double area;
	void noOfSides()
	{
		System.out.println("NO. OF SIDES OF TRIANGLE : 3");
	}
	void area()
	{
		area=(0.5)*10*4;
		System.out.println("AREA OF TRIANGLE IS :"+area);
	}
}

public class MyShape
{
	public static void main(String []args)
	{
		Cylinder c=new Cylinder();
		c.volume();
		c.area();
		Rect3d r=new Rect3d();
		r.volume();
		Triangle t=new Triangle();

		t.noOfSides();
		t.area();
	}
} 	
	

	
	
	