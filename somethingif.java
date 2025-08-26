class somethingif
{
	public static void main(String [] args)
	{
		int a=4,b=20;
		System.out.println("a="+a+" "+"b="+b);
		System.out.println("before_if");
		if(b/a!=0)
		{
			a=20;
			b=4;
			System.out.println("a="+a+" "+"b="+b);
			System.out.println("inside_if");
		}
		System.out.println("after_if");
		System.out.println("a="+a+" "+"b="+b);
	}
}