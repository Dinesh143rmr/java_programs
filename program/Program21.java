// write a java program to print Day number by using Day name ?

class Program21
{
	public static void main(String[] args) 
	{
		String name = "Tuesday";
		switch(name)
		{
        case "Monday":System.out.println("1");
		break;
		case "Tuesday":System.out.println("2");
		break;
		case "Wednesday":System.out.println("3");
		break;
		case "Tursday":System.out.println("4");
		break;
		case "friday":System.out.println("5");
		break;
		case "saturday":System.out.println("6");
		break;
		case "sunday":System.out.println("7");
		break;
		default:System.out.println("it is not a day");
		break;
		}
	}
}
