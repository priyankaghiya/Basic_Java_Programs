import java.util.Scanner;

class MatrixMulti
{
	public static void main(String args[])
	{
		Scanner ar=new Scanner(System.in);
		int[] a[]=new int[3][3];
		int[][] b=new int[3][3];
		int c[][]=new int[3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print("ENTER ELEMNT ["+i+"]["+j+"] ");
				a[i][j]=ar.nextInt();
			}
			System.out.println();
		}
		System.out.println(" ENTER SECOND MATRIX VALUES ");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print("ENTER ELEMNT ["+i+"]["+j+"] ");
				b[i][j]=ar.nextInt();
			}
			System.out.println();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a.length;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}

		}
			System.out.println("THE MULTIPLICATION MATRIX IS :");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(" "+c[i][j]);
			}
			System.out.println();
		}
		
		
					
	}
}