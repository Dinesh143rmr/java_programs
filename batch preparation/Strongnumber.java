// write a program to print strong number or not

class Strongnumber         
{
	public static void main(String[] args) 
	{
		int n=145;
		int temp=n;
		int sum=0;
		while(n!=0)
		{
			int lastdigit=n%10;
			int fact=1;
			for(int i=1;i<=lastdigit;i++)
			{
				fact=fact*i;
			}
				sum=sum+fact;
				n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("the given number is a palindrome");
		}
			else
		{
				System.out.println("the given number is not a palindrome");
		}
	}
}
