// write a program to check wheather the given value is upper case alphabte or lower case alphabte?

class Alphabte
{
	public static void main(String[] args) 
	{
		char ch = 'B';
		if (ch>='A'&&ch<='Z')
		{
			System.out.println("it is upper case alphabte");
		}
		else if (ch>='a'&&ch<='z')
		{
			System.out.println("it is lower case alphabte");
		}
		else
		{
            System.out.println("it is not a alphabte");
		}
	}
}
