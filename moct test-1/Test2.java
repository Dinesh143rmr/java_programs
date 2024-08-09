import java.util.Scanner;
class Test2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();

		for(int i=1;i<=10000;i++)
		{
			int a=i;
			int sum=0;
			while(n!=0)
			{
				int lastdigit=n%10;
				int fact=1;
				for(int j=1;j<=lastdigit; j++)
				{
					fact=fact*j;
					sum=sum+fact;
				}
					n=n/10;
			}
			if(sum==0)
			{
		        System.out.println(i);
			}
		}
	}
}
