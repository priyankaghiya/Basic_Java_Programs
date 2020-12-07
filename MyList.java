import java.io.*;

public class MyList
{
public static void main(String[] st)
{
File f=new File(st[0]);
String cont[]=f.list();
int i,fi=0,fo=0;
for(i=0;i<cont.length;i++)
{
	//File ff=new File(f,cont[i]);
	File ff=new File(st[0],cont[i]);
	if(ff.isFile())
	{
		System.out.println(cont[i]+" IS A FILE ");
		fi++;
	}
	else
	{
		System.out.println(cont[i]+" IS A FOLDER ");
		fo++;
	}
}

System.out.println("\n\n TOTAL FILE : "+fi);
System.out.println("TOTAL FOLDER :"+fo);
}
}