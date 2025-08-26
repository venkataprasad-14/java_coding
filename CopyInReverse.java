class CopyInRevrse
{
	public static void main(String [] args)
	{
		int a[]=new int[]{10,20,30,50,60};
		CopyInRevrse obj=new CopyInRevrse();
		int [] rcopy=obj.reversecopy(a);
		for(int temp:rcopy)
			System.out.print(temp+"\t");
	}
	
	int[] reversecopy(int [] a)
	{
		int b[]=new int[a.length];
		for(int i=a.length-1,j=0;i>=0;i--,j++)
		{
			b[j]=a[i];
		}
		return b;
	}
} 