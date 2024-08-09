class Perfect
{
	public static void main(String[] args) 
	{
		int m =1;
		int n =100;
		int sum=0;
		for(int i =1; i<100;i++)
		{
			if(m<n)
			{
				sum=sum+i;
			}
		}
			if(sum==n)
			{
				System.out.println("its a perfect number");
			}
			else
			{
				System.out.println("not a perfect number");
			}
	}
}

