// write a program to print weekday and weekend by reading day number?

class  Program22
{
	public static void main(String[] args) 
	{
		int n = 5&7;
		
		switch(n)
		{
		case 1:System.out.println("weekday");
		case 2:System.out.println("weekday");
		case 3:System.out.println("weekday");
		case 4:System.out.println("weekday");
		case 5:System.out.println("weekday");
		break;
		case 6:System.out.println("weekday");
		case 7:System.out.println("weekend");
		break;
		default:System.out.println("it is not a weekday or weekend");
		}
	}
}
