// write a program to print perfect square number b/w 1-100
class Perfectsquarenumber2
{	
	public static void main(String[] args) 
	{
		int m=1;
		int n=100;
		for(int i=1;i<=100;i++)
		{
			for(int j=1;j<100;j++)
			{
			if (i*i==n)
			{
				status = true;
				break;
			}
			}
		}
		if(status)
		{
			 
		  System.out.println("perfect square"+i);
		  
		  
		}
		else
		{
			System.out.println("not a perfect"+i);
		}
	}
}
