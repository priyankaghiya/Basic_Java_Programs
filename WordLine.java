import java.io.*;

public class WordLine
{
	public static void main(String []st)
	{
		try
		{
		FileReader fr=new FileReader(st[0]);
		BufferedReader br=new BufferedReader(fr);
		String w=st[1];
		String line="";
		while(line!=null)
		{
			line=br.readLine();
			if(line!=null)
			{
				if(line.indexOf(w)!=-1)
				{
					System.out.println(line);
				}
			}
		}
		fr.close();
		}
		catch(Exception e) {}
	}
}