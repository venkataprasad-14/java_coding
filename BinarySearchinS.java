
class BSinS
{
	public static void main(String [] args)
	{
		String s="Hello vara . how are you?";
		String []a=s.split(" ");
		String search="var";
		BSinS obj=new BSinS();
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