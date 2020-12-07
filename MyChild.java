class Child implements Runnable
{
	int i;
	Thread th;
	Child(int i,String na)
	{
		this.i=i;
		th=new Thread(this,na);
		th.start();
	}
	public void run()
	{
		for(int j=i;j<i+10;j++)
		{
			System.out.println(" " +th.getName()+ " : "+j);
			try{ Thread.sleep(500);}
			catch(Exception e) {}
		}
	}
}
// we cannot write throw in the run method as it is overridden method signature should be same

public class MyChild
{
	public static void main(String [] st)
	{
		Child c1=new Child(1,"Priyanka");
		try { c1.th.join();}
		catch(Exception e) {} 
                    //the effect of join will be seen on the current thread i.e main and 
		Child c2=new Child(11,"Ghiya");
		try{c2.th.join();}
		catch(Exception e) {}
		Child c3=new Child(21,"Piyu");

	}
}
		
		