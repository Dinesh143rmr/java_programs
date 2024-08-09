// write a program to print palindrome
class Palindrome1
{
	public static void main(String[] args) 
	{
		int n=121;
		int temp=n;
		int rev=0;
		while(n!=0)
		{
			int lastdigit=n%10;
			rev=rev*10+lastdigit;
			n=n/10;
		}
		if(rev==temp)
		{
			System.out.println("its a palindrome");
		}
		else
		{
			System.out.println("its not a palindrome");
		}
	}
}
