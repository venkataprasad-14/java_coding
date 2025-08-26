
class LSinS
{
	public static void main(String [] args)
	{
		String s=" 		";
		String []a=s.split(" ");
		String search="var";
		LSinS obj=new LSinS();
		System.out.println(obj.search(a,search));
	}
	
	String search(String []a,String search)
	{
		int count=0;
		for(int i=0; i<a.length;i++)
		{
			if(a[i].equals(search))
				count++;
		}
		if(count>0)
			return "found";
		else
			return "not found";
	}
}

//==============================================================

class BSinS
{
	public static void main(String [] args)
	{
		String s="Raju brought an apple to the class";
		String [] a=s.split(" ");
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j].compareTo(a[j+1])>0)
				{
					String temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(String s2:a)
		System.out.println(s2);
		
	}
	
}