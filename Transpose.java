import java.util.*;

class Transpose
{
	public static void  main(String[] piyu)
	{
		Scanner p=new Scanner(System.in);
		int a[][]=new int[3][3];
		int[][] b=new int[3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print("ENTER ELEMNT ["+i+"]["+j+"] ");
				a[i][j]=p.nextInt();
			
			}
			System.out.println();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[j][i]=a[i][j];
			}
		}

		System.out.println("THE TRANSPOSED MATRIX IS :");

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(b[i][j]);
					
			}
			System.out.println();
		}
		

	}
}



		