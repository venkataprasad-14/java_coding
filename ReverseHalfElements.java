class ReverseHalfElements
{
	public static void main(String [] aargs)
	{
		int a[]=new int[]{12,56,34,23,67,76,32,75,90,345};
		for(int i=(a.length-1)/2;i>=0;i--)//prints first half elements in reverse order
		{
			System.out.print(a[i]+"\t");
		}
		for(int i=0;i<a.length;i++)//prints whole in array
		{
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		for(int i=a.length-1;i>(a.length-1)/2;i--)//prints second half in reverse order
		{
			System.out.print(a[i]+"\t");
		}
		for(int i=0;i<a.length;i++)//prints whole elements in array
		{
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		System.out.println("even indexed elements are");
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)//prints even indexed elements
				System.out.print(a[i]+"\t");
		}
		System.out.println();
		System.out.println("odd indexed elements are");
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)//prints odd indexed elements
				System.out.print(a[i]+"\t");
		}
		System.out.println();
		System.out.println("elements which are divisible by 4 are ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%4==0)//prints elements which are divisible by 4
				System.out.print(a[i] +"\t");
		}
		System.out.println();
		System.out.println("indexes which are divisible by 3 are ");
		for(int i=0;i<a.length;i++)
		{
			if(i%3==0)//prints indexes which are divisible by 3
				System.out.print(i +"\t");
		}
		
	}
}