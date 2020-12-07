import java.util.Scanner;

class Reverse
{

	public static void main(String[] st)
	{
		int no,rem,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER ");
		no=sc.nextInt();
		System.out.println("THE REVERSE NUMBER IS :");
		while(no!=0)
		{
			rem=no%10;
			rev=rev+rem*10;
			no=no/10;
			System.out.print(rem);				
		}
		
	}
}
		


		
	