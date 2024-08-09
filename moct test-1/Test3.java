class Test3 
{

	public static void main(String[] args) 
	{
		char ch='1';
		int n=200;
		int rev=0;
		int temp=n;
		while(n!=0)
		{
			for(int i=1; i<=n;i++)
			{
			int lastdigit=n%10;
			rev=rev*10+lastdigit; 
			n=n/10;
			}
		}
		if(rev==n)
		{
		   System.out.println("ch:"+temp);
		}
	}
}
