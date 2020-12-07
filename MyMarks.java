import java.util.*;
class InvalidMarksException extends Exception
{
	int m;
	InvalidMarksException(int m)
	{
		this.m=m;
	}
	public String toString()
	{
		return "MARKS ENTERED IS INVALID ";
	}
}

public class MyMarks
{
	public static void main(String [] st)
	{
		int marks;
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE MARKS : ");
		marks=sc.nextInt();
		try
		{
			if(marks<0 || marks>100)
			{
				throw new InvalidMarksException(marks);
			}
			else
			{
				System.out.println("ENTERED MARKS ARE VALID CONTINUE THE FUTHER PROCESS");
			}
		}
		catch(InvalidMarksException ime)
		{
			System.out.println(ime);
		}

	}
}