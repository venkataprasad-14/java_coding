class ReverseHalfElements
{
	public static void main(String [] aargs)
	{
		int a[]=new int[]{12,56,34,23,67,76,32,75,90,345};
		for(int i=a.length-1;i>(a.length-1)/2;i--)
		{
			System.out.print(a[i]+"\t");
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
	}
}