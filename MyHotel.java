import java.util.Scanner;

class Hotel
{
	String na,c;
	int tr,rc,min;
	float rate;
	Scanner sc;
	Hotel()
	{
		sc=new Scanner(System.in);
	}
	
	void input()
	{
		System.out.println("ENTER NAME : ");
		na=sc.next();	
		System.out.println("ENTER CITY : ");
		c=sc.next();
		System.out.println("ENTER NO. OF ROOMS AVAILABLE : ");
		tr=sc.nextInt();
		System.out.println("ENTER ROOM CHARGES : ");
		rc=sc.nextInt();
		System.out.println("ENTER RATINGS : ");
		rate=sc.nextFloat();
	}
	void show()
	{
		System.out.println("HOTEL DETAILS : ");
		System.out.println("NAME : "+na);
		System.out.println("CITY : "+c);
		System.out.println("NO. OF ROOM AVAILABLE : "+tr);
		System.out.println("ROOM CHARGES : "+rc);
		System.out.println("RATING : "+rate);
	}
}	

public class MyHotel
{
	
	public static void main(String [] st)
	{
	int i,j,min;
	float max;
	Hotel h1[]=new Hotel[Integer.parseInt(st[0])];
	
	Hotel temp;
	for(i=0;i<h1.length;i++)
	{
		h1[i]=new Hotel();
		h1[i].input();
	}
	for(j=0;j<h1.length;j++)
		h1[i].show();
	for(i=0;i<h1.length;i++)
	{
		min=h1[0].tr;
		if(h1[i].tr<min)
		{
			min=h1[i].tr;
		}
	}
	//	System.out.println("THE HOTEL HAVING LOWEST NO. OF ROOMS IS : "+h1[i].na);
	for(int k=0;k<h1.length;k++)
	{	
		max=h1[0].rate;
		if(max>h1[k].rate)
		{
			max=h1[k].rate;
		}
	}
		
		//System.out.println("THE HOTEL HAVING HIGHEST RATING IS : "+h1[i].na);
	
	for(i=0;i<h1.length;i++)
	{
		for(j=i+1;j<h1.length;j++)
		{
			if(h1[i].rate>h1[j].rate)
			{
				temp=h1[i];		
				h1[i]=h1[j];
				h1[j]=temp;
			}
		}
		System.out.println("i+1 : "+h1[i].rate);
	}
		
	}
 }
