// write a program to check remainder of an equation is even or odd?

class  Program11
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 2;
		int c = a%b;
		String res = (c%2==0)?c+"reminder is even":c+"remainder is odd";
		System.out.println(res);
	}
}
