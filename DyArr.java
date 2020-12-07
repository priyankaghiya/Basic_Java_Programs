import java.util.*;

class DyArr
{
	public static void main(String[] st)
	{
		int i,n,cpos=0,cneg=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE ARRAY SIZE : ");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("ENTER NUMBER : ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)    
		{
			if(a[i]<0)
			{
				cneg++;
			}
			else
			{
				cpos++;
			}
		}
		for(int x:a)
		{
			System.out.print(" "+x);
		}
		System.out.println("\nPOSITIVE COUNT IS:- "+cpos+"\nNEGATIVE COUNT IS:- "+cneg);
	}
}