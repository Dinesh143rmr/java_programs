//logical AND(&&)

class  Logical
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		boolean res1 = ((10<20)&&(20>10));
        boolean res2 = ((10<20)&&(10>20));
		boolean res3 = ((10>20)&&(20>10));
		boolean res4 = ((10>20)&&(20<10));
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);


	}
}
