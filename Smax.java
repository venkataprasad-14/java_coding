class SmaxinArray
{
	public static void main(String [] args)
	{
		int [] a=new int[]{56,0,5,45,212,94,212};
		int smax=0,max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				smax=max;
				max=a[i];
			}
			else if(a[i]<max && a[i]>smax)
				smax=a[i];
		}
		System.out.println(smax);
		System.out.println(max);
	}
}