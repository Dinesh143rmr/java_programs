class Perfect1
{
	public static void main(String[] args) 
	{
		for(int i =1; i<=100;i++)
		{
			int sum=0;
			int a=i;
			for(int j =1;j<a;j++)
			{
			if(a%j==0)
				{
				sum = sum+j;
				}
			}
				if(sum == a)
				{
			System.out.println("it is perfect number"+a);
				}
		}
	}
}

