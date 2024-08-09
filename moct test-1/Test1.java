import java.util.Scanner;

class Test1 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sum=0;
		int product=1;
		for(int i=1; i<=n; i++)
		{
			
			int lastdigit=n%10;
			sum=sum+i;
			product=product*i;
			n=n/10;
			
		}
		System.out.println("print sum of even digits:"+sum);
		System.out.println("print product of even digits:"+product);
	}
}
