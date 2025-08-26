class CopyEvenIndexed
{
	public static void main(String [] args)
	{
		int a[]=new int[] {4,5,6,7,8};
		int size=(a.length+1)/2;
		int b[]=new int[size];
		System.out.println("The size of the b array is "+b.length);
		
		int count=0;
		
		for(int i=0;i<a.length;i++)//o<5 t //1<5 t //2<5 t //3<5 t //4<5 t //5<5 f
		{
			if(i%2==0) //0%2 t //1%2 f // 2%2 t //3%2 f //4%2 t
			{
				b[count]=a[i];// b[0]=a[0]=4 //b[1]=a[2]=6 //b[2]=a[4]=8
			     count++;//1//2//3
			}
			
		}
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);
	}
}

//_____________________________________________________________________

class CopyEvenIndexedWM
{
	public static void main(String [] args)
	{
		int a[]=new int[] {4,5,6,7,8};
		CopyEvenIndexedWM obj=new CopyEvenIndexedWM();
		int r[]=obj.copyevenindex(a);
		for (int temp:r)
			System.out.print(temp+" ");
	}
	int [] copyevenindex(int [] a)
	{
		int [] b = new int[(a.length+1)/2];
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				b[j]=a[i];
				j++;
			}
		}
		return b;
	}
}