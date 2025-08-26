class something
{
	public static void main(String [] args)
	{
		int a=4,b=5;
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("a="+a+"  "+"b="+b);
		System.out.println(a==a);	//true
		System.out.println(b==b);	//true
		System.out.println(a%b==0);	//false
		System.out.println(a>b);	//true
		System.out.println(b>a);   //false
		System.out.println(b>=20); //false
		System.out.println(a>=5); //true
		
			
	}
}