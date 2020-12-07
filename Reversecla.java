public class Reversecla
{
	public static void main(String [] st)
	{
		String s=st[0];
		String rev="";
		int i;
		for(i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("REVERSE :"+rev);
	}
}
			




