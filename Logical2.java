// logical OR(||)

class  Logical2
{
	public static void main(String[] args) 
	{
		int a = 20;
		int b = 30;
		boolean res1 = ((a<b)||(b>a));
		boolean res2 = ((a<b)||(a>b));
		boolean res3 = ((a>b)||(b>a));
		boolean res4 = ((a>b)||(b<a));
		System.out.println(res1);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
	}
}
