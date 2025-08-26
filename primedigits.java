//check and print the digits in a number are prime or not prime

class primedigits
{
   public static void main(String [] args)
   {
	int n=451;
	while(n>0)
	{
	  int a=n%10;
	  int count=0;
	  for(int i=2;i<=a/2;i++)
	  {
		if(a%i==0)
		count++;
	  }
	  n=n/10;
          System.out.println((count==0)?(a+" is prime"):(a+" is not prime"));	  
	}
   }
}

//sum the factors of a number and check that value is prime or not

class sumfactors
{
  public static void main(String args[])
  {
    int n=12,sum=0,count=0;
    for(int i=1;i<=n;i++)
    {
      if(n%i==0)
	sum+=i;
    }
    for(int i=2;i<=n/2;i++)
    {
      if(n%i==0)
	count++;
    }
    System.out.println("The sum of factors of the given number is "+sum);
    System.out.println((count==0)?(sum+" is prime"):(sum+" is not prime"));
  }
}