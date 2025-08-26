a->10,19,30,45,50
b->10,30,50,45,19
class Storing
{
	public static void main(String [] args)
	{
		int [] a=new int[] {10,19,30,45,50};
		int [] b=new int[a.length];
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			int k=a.length-1;
			if(a[i]%2==0)
			{
				b[j++]=a[i];
			}
			else
			{
				b[k]=a[i];
				k--;
			}
		}
		for(int temp:b)
			System.out.print(temp+"\t");
	}
}