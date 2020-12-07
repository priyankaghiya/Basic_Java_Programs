class Thmulti implements Runnable
{ 
	int n;
	Thread th;
	Thmulti(int n)
	{
		this.n=n;
	        th=new Thread(this);
		th.start();
	}

	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			int m=n*i;
			System.out.println(n + "X" + i +"=" + m);
		}
		System.out.println("\n");
	}
}

class MyThmulti
{
	public static void main(String []ar)
	{
		int n=Integer.parseInt(ar[0]);
		for(int j=1;j<=n;j++)
		{
		Thmulti t1=new Thmulti(j);
		try{t1.th.join();}
		catch(Exception e) {}
		}
	}
}	