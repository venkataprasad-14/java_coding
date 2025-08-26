//make first letter capital for every word
class Capital
{
	public static void main(String [] args)
	{
		String s="Hello all good morning";
		String [] a=s.split(" ");
		
		for(int i=0;i<a.length;i++)
		{
			//String s2=a[i];
			String concat="";
			char [] ch=a[i].toCharArray();
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]>='a' && ch[i]<='z')
				{
					concat+=(char)(ch[j]-32);
				}
				else
					concat+=ch[j];
			}
			System.out.println(concat);
		}
	}
}

//largest and smallest word in a sentence
class SL
{
	public static void main(String [] args)
	{
		String s="Hello all good morning everyone";
		String [] a=s.split(" ");
		String small=a[0],large=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(small.length()>a[i].length())
				small=a[i];
			if(large.length()<a[i].length())
				large=a[i];
		}
		System.out.println(small);
		System.out.println(large);
	}
}