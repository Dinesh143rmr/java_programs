// write a program to find smallest of 3 numbers?

class  Smallest
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		int c = 30;
		String res = (a<b)||(a<c)?a+"is smallest":b+"is smallest";
		System.out.println(res);
	}
}
