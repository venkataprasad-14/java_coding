//frequency of elements in array
class Frequency
{
	public static void main(String [] args)
	{
		int a[]=new int[]{10,20,10,40,60,40,50};
		boolean b[]=new boolean[a.length];
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			if(b[i]==true)
				continue;
			for(int j=i+1;j<a.length;j++ )
			{
				if(a[i]==a[j])
				{
					count++;
					b[j]=true;
				}
			}
			/*if(count>1)
			{
				System.out.println("Duplicates "+a[i]+" frequency is"+count );
			}
			else if(count==1)
			{
				System.out.println("Unique "+a[i]);
			}
			*/
			System.out.println("frequency of "+a[i]+" is "+count );//prints element atmost once with its frequency of occurance in array.
			
			
		}
	}
}

//sum of duplicates
class duplicates
{
	public static void main(String [] arhs)
	{
		int a[]=new int[]{20,30,40,50};
		boolean b[]=new boolean[a.length];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			if(b[i]==true)
				continue;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					b[j]=true;
				}
			}
			if(count>1)
				sum+=a[i];
		}
		if(sum>0)
				System.out.println("The sum of duplicate element is "+sum);
			else 
				System.out.println("No duplicates in the array");
	}
	
}