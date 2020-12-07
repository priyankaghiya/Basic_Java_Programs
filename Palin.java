public class Palin
{
	public static void main(String []st)
	{
		String s=st[0];
		String n="";
		for(int i=s.length()-1;i>=0;i--)
		{
			n=n+s.charAt(i);
		}
		if(n.equals(s))
		{
			System.out.println("STRING IS PALINDROME");	
		}
		else
		{
			System.out.println("STRING IS NOT PALINDROME");
		}
	}
}



		/*int i=0,k,j,f=0;
		String a;
		String s;
		s=st[0];
		for(i=0,j=s.length()-1;i<s.length()/2;i++,j--)
		{
		if(st.charAt(i)!=st.charAt(j))
		{
			f=1;
			break;
		}

`		}


		if(f==0)
		{
			System.out.println("STRING IS PALINDROME");
		}
		else
		{
			System.out.println("STRING IS NOT PALINDROME");		
		}*/