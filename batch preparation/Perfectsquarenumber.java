class Perfectsquarenumber 
{	
	public static void main(String[] args) 
	{
		int n=4;
		boolean status=false;
		for(int i=1;i<4;i++)
		{
			if (i*i==n)
			{
				status = true;
				break;
			}
		}
		if(status)
		{
			 
		  System.out.println("perfect square");
		}
		else
		{
			System.out.println("not a perfect");
		}
	}
}
