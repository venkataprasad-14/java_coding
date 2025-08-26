class SwapEleInArray //left rotation
{
	public static void main(String [] args)
	{
		int a[]=new int[]{4,5,3,23,56,67};
		System.out.println("The elements before swapping are ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
		
		System.out.println();
		
		for(int r=1;r<a.length;r++)
		{
			int b=a[0];
			for (int i=1;i<a.length;i++)
			{
				a[i-1]=a[i];
			}
			a[a.length-1]=b;
			
			System.out.println();
		    System.out.println("The elements after "+r+" rotation are ");
			for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
		}
		
		
	}
	
}
//___________________________________________________________________________

class SwapAdjacentEleInArray
{
	public static void main(String [] args)
	{
		int a[]=new int[]{4,5,3,23,56,67};
		System.out.println("The elements before swapping are ");
		//for(int i=0;i<a.length;i++)
			//System.out.print(a[i]+"\t");
		for(int temp:a)
			System.out.println(temp);
		
		System.out.println();
		for (int i=0;i<a.length-1;i++)
		{
			//int 
		}
		
		System.out.println();
		System.out.println("The elements after swapping are ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
	}
	
}

//___________________________________________________________________________

