import java.util.Scanner;

class Employee
{
	int id;
	String na;
	Employee(int id,String na)
	{
		this.id=id;
		this.na=na;
	}
	void show()
	{
		System.out.println("EMPLOYEE DETAILS :");
		
		System.out.println("ID "+id);
		System.out.println("NAME "+na);
	}
}

class Permanant extends Employee
{
	double sal;
	Permanant(int id,String na,double sal)
	{
		super(id,na);
		this.sal=sal;
	}
	Permanant(int id,String na)
	{
		super(id,na);
	}
}

class Monthly extends Permanant 
{
	double sal,tot_sal;
	Monthly(int id,String na,double sal)
	{
		super(id,na);
		this.sal=sal;
	}
	void show()
	{
		 float hra=10/100;
		float da=1/100;
		tot_sal=(hra*sal)+(sal*da)+sal;
		System.out.println("TOTAL SALARY "+tot_sal);
	}
}

class Hourly extends Permanant
{
	double hrs,pay;
	Hourly(int id,String na,double hrs,double pay)
	{
		super(id,na);
		this.hrs=hrs;
		this.pay=pay;
	}
	void show()
	{

	super.show();
	double hp=hrs*pay;
	System.out.println("TOTAL SALARY "+hp);	
	}
}

class Commission extends Employee
{
	double sales,tot_pay;
	Commission(int id,String na,double sales)
	{
		super(id,na);
		this.sales=sales;
	}
	void show()
	{
	double per=(double)10/(double)100;
	tot_pay=sales*per;
	super.show();
	System.out.println("TOTAL PAY = "+tot_pay);
	}
}	

public class MyEmployee
{
	public static void main(String [] st)
	{
		Monthly m1=new Monthly(19,"Priyanka",1000000);
		Hourly h1=new Hourly(1,"abc",2,100);
		Commission c1=new Commission(123,"Vaidehi",123345);
		m1.show();
		h1.show();	
		c1.show();
	}
}