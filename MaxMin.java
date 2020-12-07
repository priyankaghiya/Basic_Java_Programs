public class MaxMin
{
	public static void main(String [] st)
	{
		int max=0,min=0;
		int n[]=new int[st.length];
		for(int i=0;i<st.length;i++)
		n[i]=Integer.parseInt(st[i]);
		for(int j=1;j<st.length;j++)
		{
			max=n[0];
			if(n[j]>max)
			max=n[j];
		}
		System.out.println("MAXIMUM : "+max);
		for(int k=1;k<st.length;k++)
		{
			min=n[0];
			if(n[k]<min)
			min=n[k];
		}

		System.out.println("MINIMUM : "+min);
	}
}	
