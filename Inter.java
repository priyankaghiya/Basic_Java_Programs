class Bank
{
	String bna,add;
	Bank(String bna,String add)
	{
		this.bna=bna;
		this.add=add;
	}
	void bdisp()
	{
		System.out.println("BANK CUSTOMER DETAILS :");
		System.out.println("NAME : "+bna+"\n"+"Address : "+add);
	}
}

interface ATM
{
	double max_widraval=10000;
	void wid();
	
}

interface cheque
{
	int max_issue=100;
	void cdisp();
	
}


class Customer extends Bank implements ATM,cheque
{
	String cna;
	int cid;
	Customer(String bna,String add,String cna,int cid)
	{
		super(bna,add);
		this.cid=cid;
		this.cna=cna;
	}

void show()
{
	bdisp();
	cdisp();
	wid();
      	    System.out.println("Name :"+cna+"\n"+"id : "+cid);
}
		
public void cdisp()
{
	System.out.println("Maximum Cheque Issue : "+max_issue);
}
public void wid()
{
	System.out.println("Maximum Withdraval : "+max_widraval);
}		
}

class Inter
{
	public static void main(String [] st)
	{
		Customer c=new Customer("BOB","Manjalpur","Rupal",111);
		c.show();
	}
}