class CopyingArray
{
	public static void main(String [] args)
	{
		int [] a=new int[]{10,20,30,40,50};
		CopyingArray obj=new CopyingArray();
		int copy[]=obj.copyarray(a);
		for(int temp:copy)
			System.out.print(temp+"\t");
		
	}
	
	int [] copyarray(int []arr)
	{
		int b []=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			b[i]=arr[i];
		}
		return b;
	}
}