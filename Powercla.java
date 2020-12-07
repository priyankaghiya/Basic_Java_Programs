public class Powercla
{
	public static void main(String [] args)
	{
		int p=1;
		 int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
			for(int i=b;i>0;i--)   //for(i=1;i<=b;i++)
			{
				p=p*a;
			}
		System.out.println("POWER :"+p);
	}
}
		