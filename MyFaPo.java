class FaPo implements Runnable
{
	int n; int flag; int x;int p;
	Thread th;
	FaPo(int n,int x,int p,int m)
	{
		this.n=n;
		this.x=x;
		this.p=p;
		flag=m;
		th=new Thread(this);
		th.start();
	}
	
	int fact()
	{
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		return f;
	}
	int power()
	{
		int power=1;
		for(int j=1;j<=p;j++)
		{
			power=power*x;
		}
		return power;
	}
	public void run()
	{
		if(flag==0)
		{
			System.out.println("FACTORIAL: "+fact());			
		}
		else
		{
			System.out.println("POWER: "+power());
		}
	}
}
				 
public class MyFaPo
{
	public static void main(String [] st)
	{
	int n=Integer.parseInt(st[0]);
	int x=Integer.parseInt(st[1]);
	int p=Integer.parseInt(st[2]);
	
	FaPo f2=new FaPo(n,x,p,0);
	FaPo f1=new FaPo(n,x,p,1);
	}
}