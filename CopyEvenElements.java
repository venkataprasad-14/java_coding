class CopyEvenElements
{
	public static void main(String [] args)
	{
		int []a= new int []{14,19,20,40,55};
		int []b=new int[a.length];
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				b[j]=a[i];
				j++;
			}
		}
		for(int temp:b)
			System.out.print(temp+" ");
	}
}
//_______________________________________________________

class CopyEvenElementsWM
{
	public static void main(String [] args)
	{
		int []a= new int []{14,19,20,40,55};
		CopyEvenElementsWM obj=new CopyEvenElementsWM();
		int b[]=obj.copyevenelements(a);
		for(int temp:b)
			System.out.print(temp+" ");
	}
	int [] copyevenelements(int a)
	{
		int []b=new int[a.length];
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				b[j]=a[i];
				j++;
			}
		}
		return b;
	}
}
