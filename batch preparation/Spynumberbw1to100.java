
// write a program to spy number b/w 1-100

class  Spynumberbw1to100
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=100;i++)
		{
		int n=i;
		int sum =0;
		int product=1;
		while(n!=0)
		{
			int lastdigit=n%10;
			sum=sum+lastdigit;
			product=product*lastdigit;
			n=n/10;

		}
		if(sum==product)
		{
			System.out.println("its a spy number"+i);
		}
		else
		{
			System.out.println("its not a spy number"+i);
		}
	}
	}
}
