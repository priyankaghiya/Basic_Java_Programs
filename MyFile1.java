import java.io.*;

public class MyFile1
{
public static void main(String []st)
{
	File f=new File(st[0]);
	String cont[]=f.list();
	int n=Integer.parseInt(st[1]);
	int i;
	for(i=0;i<cont.length;i++)
	{
		File ff=new File(st[0],cont[i]);
		if(ff.length()>n)
		{
			System.out.println("FILENAME :"+cont[i]+"==+ff.length());	
		}
	}
}
}