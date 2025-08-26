class evenodd
{
	public static void main(String [] arg)
	{
		int a=5;
		int b=2;
		String s= (a%2==0)?("EVEN"):("ODD");
		System.out.println(s);
		double d= b;
		System.out.println(a/b); //5/2=2
		System.out.println(a%b); //5%2=1
		System.out.println(a/d); //5/2.0=2.5
		System.out.println(a%d); //5%2.0=1.0
		System.out.println(d/a); //2/5=0.4
		System.out.println(d%a); //2%5=2.0
	}
}