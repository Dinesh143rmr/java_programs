// write a program to spy number

class  Spynumber1
{
	public static void main(String[] args) 
	{
		int n=123;
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
			System.out.println("its a spy number");
		}
		else
		{
			System.out.println("its not a spy number");
		}
	}
}