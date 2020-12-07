import java.util.*;

class Queue
{
	int rear,front;		
	int q[],n;
	Scanner sc;
	Queue(int size)
	{
		rear=-1;
		front=-1;
		sc=new Scanner(System.in);
		q=new int[size];
	}
	void insert()
	{
		if(rear==q.length-1)
		{
			System.out.println("QUEUE OVERFLOW ");
		}
		else
		{
			System.out.println("ENTER No : ");
			n=sc.nextInt();	
			q[++rear]=n;
		}	
	}
	void delete()
	{
		if(front==rear)
		{
			System.out.println("QUEUE UNDERFLOW ");
			rear=-1;front=-1;
		}
		else
		{
			n=q[++front];
			System.out.println("\n THE DELETED NO. IS "+n);
		}
	}
}

public class MyQueue
{
	public static void main(String []st)
	{
		Scanner s=new Scanner(System.in);
		Queue q1=new Queue(Integer.parseInt(st[0]));		
		int ch=0;
		while(ch!=3)
		{
			System.out.println(".......MENU .......");
			System.out.println("1.INSERT ");
			System.out.println("2.DELETE ");
			System.out.println("3.EXIT ");
			System.out.println("ENTER THE VALUE ");
			ch=s.nextInt();
			switch(ch)
			{
				case 1: q1.insert(); break;
				case 2: q1.delete(); break;
			}
		}
	}
}

			
		