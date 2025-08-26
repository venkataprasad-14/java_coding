class ArmstrongWM
{
	public static void main(String [] args)
	{
		int n=371;
		methods x=new methods();
		int count=x.digitcount(n);
		int sum=x.sum(n,count);
		x.check(sum,n);
	}
}

class methods
{
   int digitcount(int n)
   {
     int count=0;
	  while(n>0)
	  {
	    count++;
		n/=10;
	  }
	  return count;
   }
   int sum(int n,int count)
   {
		int sum=0;
		while(n>0)
		{
			int a=n%10;
			sum+=Math.pow(a,count);
			n=n/10;
		}
		return sum;
   }
   void check(int sum,int n)
   {
		if(sum==n)
			System.out.println(n+" is armstrong number");
		else
			System.out.println(n+" is not an armstrong number");
   }
}
