class missingdigits
{
   public static void main(String [] args)
   {
	int num=6789,n=num;
	while(n>0)
	{
	  if(4==n%10)
		System.out.println("digit found");
	  else
		System.out.println("digit not found");
	  n=n/10;
	}
   }
}