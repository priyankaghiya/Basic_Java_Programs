import java.util.*;

public class Power
{
	public static void main(String[] pg)
	{
		Scanner will=new Scanner(System.in);
		int b;
		float a,f=1;
		System.out.println("ENTER BASE");
		a=will.nextFloat();
		System.out.println("ENTER EXPONENT");
		b=will.nextInt();
		for(int i=1;i<=b;i++)
		{
			f=(f*a);
		}
		System.out.println("THE POWER IS "+f);
			
	}
}