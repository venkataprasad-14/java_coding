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


//print the prime numbers in 1 to 1000 numbers

class prime1
{
  public static void main(String [] args)
  { 
   int count1=0;
   for(int j=1;j<=1000;j++)
    {
      int count=0;
      for(int i=1;i<=j;i++)
       {
          if(j%i==0)
           {
	      count++;
	   }
       }
      if(count==2)
       {
         count1++;
         System.out.println(j);
       }
    }
   System.out.println("The total prime numbers in 1 to 1000 are "+count1);
  }
}

//check the above prime numbers are palindrome or not and armstrong or not .

class prime2
{
  public static void main(String [] args)
  { 
   int count1=0;
   for(int j=1;j<=1000;j++)
    {
      int count=0;
      for(int i=1;i<=j;i++)
       {
          if(j%i==0)
           {
	      count++;
	   }
       }
      if(count==2) //checking prime number
       {
         count1++;
         System.out.println(j);
         int n=j,rev=0,sum=0,count2=0;

            while(n>0)  //reversing the number
             {
		count2++; //counting digits of number
          	rev=(rev*10)+(n%10);
	 	 n/=10;
	     }
	    if(rev==j)  //palindrome check
	 	System.out.println("palindrome");
	    n=j;

        //armsrong check
	    while(n>0)
	    {
	      int r=n%10;
	      double d=Math.pow(r,count2);
		sum+=d;
		n/=10;
            }
	    if(sum==j)
		System.out.println("Armstrong");
       }
    }
   System.out.println("The total prime numbers in 1 to 1000 are "+count1);
  }
}


//print only palindromic primes