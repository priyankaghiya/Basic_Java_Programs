import java.util.Scanner;

public class Stringhw
{
	public static void main(String[] s)
	{
		Scanner sc=new Scanner(System.in);
		String s1=new String();
		s1=sc.next();
		StringBuffer sb=new StringBuffer(s1);
		s1=sb.reverse().toString();
		System.out.println(s1);
	}
}
	 
