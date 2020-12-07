public class Sum
{	
	public static void main(String[] q)
	{
		int sum=0;
		int n[]=new int [q.length];
		for(int i=0;i<q.length;i++)
		{
			n[i]=Integer.parseInt(q[i]);
		}
		for(int i=0;i<q.length;i++)
		{
			sum=sum+n[i];
		}
		System.out.println("SUM IS : "+sum);
	}
}	
