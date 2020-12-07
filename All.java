public class All
{
	public static void main(String []p)
	{
		char ch;
		int sp=0,d=0,u=0,l=0,s=0;
		String t=p[0];
		for(int i=0;i<t.length();i++)
		{
			ch=t.charAt(i);
			if(ch>=65 && ch<=90)
			u++;
			else if(ch>=97 && ch<=122)
			l++;
			else if(ch==32)
			s++;
			else if(ch>=48 && ch<=57)
			d++;
			else
			sp++;
		}

			System.out.println("UPPER : "+u);
			System.out.println("LOWER : "+l);
			System.out.println("SPACE : "+s);
			System.out.println("DIGITS : "+d);
			System.out.println("SPECIAL CHARACTERS : "+sp);

	}
}