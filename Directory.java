import java.util.Scanner;

class MyDirectory
{
	Scanner sc;
	MyDirectory()
	{
		sc=new Scanner(System.in);
	}	

	String cna,area;
	double pno;
	
	void input()
	{
		System.out.println("NAME :");
		cna=sc.next();
		System.out.println("AREA : ");
		area=sc.next();
		System.out.println("PHONE NO. : ");
		pno=sc.nextInt();
	}

	void show()
	{
		System.out.println("NAME :"+cna);
		System.out.println("AREA : "+area);
		System.out.println("PHONE NO. : "+pno);
	}


}
public class Directory
{ 
	public static void main(String [] st)
	{
		Scanner s=new Scanner(System.in);
		String ar;
		MyDirectory md[]=new MyDirectory[Integer.parseInt(st[0])];
		for(int i=0;i<md.length;i++)
		{
			md[i]=new MyDirectory();
			md[i].input();
		}
		for(int i=0;i<md.length;i++)
		md[i].show();
		System.out.println("ENTER AREA : ");
		ar=s.next();
		for(int j=0;j<md.length;j++)
		{
			if(ar.equals(md[j].area))
			{
				MyDirectory d[j]=md[j];
			}
		}
		for(int j=0;j<md.length;j++)
		d[j].cna;
	
	}
}		