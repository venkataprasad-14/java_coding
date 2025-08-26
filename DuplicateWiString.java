//duplicate words ina string

class DuplicateWiString
{
	public static void main(String [] args)
	{
		String s="hi ganesh hi suresh";
		String [] a= s.split(" ");
		boolean [] b=new boolean[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(b[i]==true)
				continue;
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					count++;
					b[j]=true;
				}
			}
			if(count>1)
				System.out.println(a[i]+" => have Duplicates ");
			else
				System.out.println(a[i]+" => is unique ");
		}
		
	}
}
