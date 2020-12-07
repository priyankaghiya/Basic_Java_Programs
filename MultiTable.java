public class MultiTable
{
	public static void main(String [] st)
	{
		int m=0;
		int n=Integer.parseInt(st[0]);
		for(int i=1;i<=10;i++)
		{
			m=n*i;
			System.out.println(n+"*"+i+"="+m);
		}
	}
}