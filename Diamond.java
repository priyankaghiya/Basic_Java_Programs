interface p1
{
void show1();
}
abstract class p2 implements p1
{
abstract void  show2();
}
interface p3 extends p1
{
void show3();
}
class p4 extends p2 implements p3
{
	void disp()
	{
	show1();
	show2();
	show3();
	show4();
	System.out.println("I AM IN P4 DISP");
	}
	void show4()
	{
		System.out.println("I AM IN P4 SHOW");
	}
	public void show3()
	{
		System.out.println("I AM IN P3 SHOW");
	}
	void show2()
	{
		System.out.println("I AM IN P2 SHOW");
	}
	public void show1()
	{
		System.out.println("I AM IN P1 SHOW");
	}	
}

public class Diamond
{
	public static void main(String []st)
	{
	p4 a=new p4();
	
	a.disp();
	}
}