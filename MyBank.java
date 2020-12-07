import java.util. *;

class Bank
{	
	int id,cb,ob,w,d;
	String na,c;
	Scanner sc;
	Bank()
	{
		id=0;
		cb=0;
		ob=0;
		w=0;
		d=0;
		sc=new Scanner(System.in);
	}
	Bank(int id,String na,int ob)
	{
		this.id=id;
		this.na=na;
		this.ob=ob;
		cb=ob;
		sc=new Scanner(System.in);

	}
	void depo()
	{	
			
			System.out.println("ENTER AMOUNT TO BE DEPOSITED");	
			d=sc.nextInt();
			cb=cb+d;
	}		
		
	void wd()
	{
		System.out.println("MINIMUM BALANCE SHOULD BE 1000 AFTER WITHDRAW");
		while(w!=-1)
		{
			System.out.println("ENTER AMOUNT TO BE WITHDRAW");
			w=sc.nextInt();
			if(w>cb-1100)
			{
			System.out.println("BALANCE BELOW 1000 CHARGES MAY APPLY");
			System.out.println("DO YOU WANT TO CONTINUE" );
			System.out.println("PRESS y or Y");
			c=sc.next();
			cb=cb-w-100;	
			System.out.println("WITHDRAW SUCCESSFUL");			
			}
			else
			cb=cb-w;
			System.out.println("WITHDRAW SUCCESSFUL");
		}
				
	}

	void display()
	{
		System.out.println("THE CUSTOMER DETAILS ARE : ");
		System.out.println("ID : "+id);
		System.out.println("NAME : "+na);
		System.out.println("OPENING BALANCE : "+ob);
		System.out.println("DEPOSIT : "+d);
		System.out.println("WITHDRAW : "+w);
		System.out.println("CLOSING BALANCE : "+cb);		
			
	}
}

public class MyBank
{
	public static void main(String []st)
	{
		Bank b1=new Bank(Integer.parseInt(st[0]),st[1],Integer.parseInt(st[2]));
		Scanner sc=new Scanner(System.in);
		int ch=0;
		while(ch!=4)
		{
			System.out.println("1. DEPOSIT ");
			System.out.println("2. WITHDRAW");
			System.out.println("3. DISPLAY ");
			System.out.println("4. EXIT");
			System.out.println("ENTER YOUR CHOICE ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1: b1.depo(); break;
				
				case 2: b1.wd(); break;
				
				case 3:b1.display(); break;
			}
		}
	}
}

		