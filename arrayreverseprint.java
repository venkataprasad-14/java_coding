class arrayreverseprint
{
  public static void main(String args[])
  {
     int a[] = new int[]{4,5,6,7,8,9};
	 int i,j;
	 for( i=a.length-1;i>(a.length-1)/2;i--)
		 System.out.println(a[i]);
	 for( j=0;j<=(a.length-1)/2; j++)
		 System.out.println(a[j]);
  }
}