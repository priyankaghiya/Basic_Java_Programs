public class CountChar 
{
public static void main(String [] s)
{	
	
	int c=0;
	String a=s[0];
	String b=s[1];
	char ch=b.charAt(0);
	
	for(int j=0;j<a.length();j++)
	{
         	if(ch==a.charAt(j))
		{
			c++;
		}  			
	}
	System.out.println("TOTal no of Repeated Characters Are "+c);



}
}
	