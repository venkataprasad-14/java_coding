class SmallestLargest
{
	public static void main(String [] rgs)
	{					  //0 1 2 3 4 5-->length=6
		int [] a=new int[] {0,1,4,5,9,6,8};
		int small=a[0];//0
		int largest=a[0];//0
		for(int i=0;i<a.length;i++)//0<5
		{
			if(a[i]>largest)//0<1
				largest=a[i];
			if(a[i]<small)
				largest=a[i];
		}
		System.out.println("Smallest element in the array is "+small);
		System.out.println("Largest element in the array is "+largest);
	}
}