class abc
{
	public static void main(String [] args)
	{
		int a=121;
		String n="";
		n=n+a;
		System.out.println(n);
		StringBuffer sb=new StringBuffer();
		sb.reverse();
		System.out.println(n.contentEquals(sb)?" P ":"N P");
	}
}

class bca
{
	public static void main(String [] args)
	{
		int sum=10;
		String s="124";
		int y=Integer.parseInt(s);
		Double x=Double.valueOf(s);
		System.out.println(x+"    "+y);
		
	}
}

class ConvertChartoInt
{
	public static void main(String [] args)
	{
		String s="Hi1hello2namasthe3";
		char [] ch=s.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='1' && ch[i]<='9')
			{
				sum=sum+Character.getNumericValue(ch[i]);	
			}
		}
		System.out.println(sum);
		
	}
	
}