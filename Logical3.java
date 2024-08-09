//Logical NOT(!) AND(&&) OR(||)

class  Logical3
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 15;
		boolean res1 = !(a<b);
		boolean res2 = ((a<b)&&(a<b));
		boolean res3 = ((a>b)||(b>a));
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
	}
}
