import java.util.*;

public class Multi
	{
	public static void main(String[] st)
		{
			int n,no;
			Scanner scan=new Scanner(System.in);
			System.out.println("ENTER THE NUMBER :");
			n=scan.nextInt();
				for(int i=1;i<=10;i++)
				{
					no=n*i;					
					System.out.println(n+"*"+i+"="+no);
				}
		}
	}