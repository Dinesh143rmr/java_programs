// write a program to print largest of 3 numbers?

class Largest
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		int c = 30;
		String res = (a>b)&&(a>c)?a+"is largest":(b>c)?:b+"is largest":c+"is largest";
		System.out.println(res);
	}
}
