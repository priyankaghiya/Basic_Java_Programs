import java.util.*;

class Menu
{	
	int m,i,b,n,o,j,k;
	Scanner sc;
	Menu()
	{
		b=0;i=0;j=0;k=0;
		m=0;n=0;o=0;
		sc=new Scanner(System.in);
	}
	void starter()
	{
		System.out.println("1.PANEER CHILLI  120/- ");
		
		System.out.println("2.VEG. MANCHURIAN 100/-");
		
		System.out.println("3.GARLIC BREAD 120/-");
					
		
		System.out.println("ENTER TOTAL NO OF DISH AND ITEM");
		m=sc.nextInt();
		i=sc.nextInt();
			if(i==1)
			b=b+m*120;
			else if(i==2)
			b=b+m*100;
			else 
			b=b+m*120;
		}
	void MainMenu()
	{
		System.out.println("1.VEG. KOHLAPURI   120/-");
		System.out.println("2.KAJU PANNER MASALA  110/- ");
		System.out.println("3.CHEESE NAAN  70/- ");
		System.out.println("4.BUTTER ROTI  30/- ");
		System.out.println("ENTER TOTAL NO OF DISH AND ITEM");
		n=sc.nextInt();
		j=sc.nextInt();
			if(j==1)
			b=b+n*120;
			else if(j==2)
			b=b+n*110;
			else if(j==3)
			b=b+n*70;
			else
			b=b+n*30;
	}

	void desert()
	{
		System.out.println("1.CHOCOLATE CHIPS CONE  40/-");				
		System.out.println("2. KESAR PISTA  50/-");
		System.out.println("3.MAVA MALAI  35/-");
		System.out.println("4.CREAM AND COOKIE 50/-");
		System.out.println("ENTER TOTAL NO OF DISH AND ITEM");
		o=sc.nextInt();
		k=sc.nextInt();
			if(k==1)
			b=b+o*40;
			else if(k==2)
			b=b+o*50;
			else if(k==3)
			b=b+o*35;
			else
			b=b+o*50;
		}
	void bill()
	{	
		System.out.println("YOUR BILL IS "+b);
	}
} 
public class MyMenu
{
	public static void main(String []s)
	{
		Scanner sc=new Scanner(System.in);
		int ch=0;
		Menu m1=new Menu();
		while(ch!=5)
		{
			System.out.println("....MENU....");
			System.out.println("1.STARTER ");
			System.out.println("2.MAIN COURSE ");
			System.out.println("3.DESERT ");
			System.out.println("4. BILL DISPLAY ");
			System.out.println("5.EXIT");
			System.out.println("ENTER YOUR CHOICE ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1: m1.starter(); break;
				case 2:m1.MainMenu(); break;
				case 3:m1.desert(); break;
				case 4:m1.bill(); break;
			}
	
		}
	}
}	