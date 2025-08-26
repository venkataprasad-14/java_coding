class bubblesort
{
	public static void main(String [] args)
	{
		int [] a=new int[]{23,10,67,90,-4};
		for(int var:a)
				System.out.print(var+" ");
		System.out.println();
		System.out.println("After bubblesorting ");
		int count=0;
		for(int i=0;i<a.length-1;i++)
		{
			int min=0;
			
			for(int j=0;j<a.length-1-i;j++)
			{
				count++;
				if(a[j]>a[j+1])
				{
					min=j; 
					int temp=a[min];
					a[min]=a[j+1];
					a[j+1]=temp;
				}
			}
			for(int var:a)
				System.out.print(var+" ");
			System.out.println();
		}
		
			System.out.println(count);
	}
}