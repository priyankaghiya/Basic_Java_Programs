import java.util.*;

public class Factorial
	{
		public static void main(String[] st)
			{
				int no,n=1;
				Scanner scan=new Scanner(System.in);
				System.out.println(" ENTER NO. FOR WHICH FACTORIAL IS TO BE FOUND : ");
				no=scan.nextInt();
					if(no<0)
					System.out.print(" ERROR ");
					else
					{
						for(int i=1;i<=no;i++)
						n=n*i;
					}
					System.out.print(" Factorial of "+no+ "is : "+n);
			}
	}





