class digits
{
   public static void main(String [] args)
   {
	int a=5;
	for(int x=1;x<=20;x++)
	{
	   
	   System.out.println(a+" * "+ x +" = "+ (a*x));
	}

   }
}

/*__________________________________________________________________________________________*/


class table
{
   public static void main(String [] args)
   {
	int a=5,x=1;
	while(x<=20){
	   System.out.println(a+" * "+ x +" = "+ (a*x));
	   x++;
	}

   }
}

/*__________________________________________________________________________________________*/

class oddresult
{
   public static void main(String [] args)
   {
	int a=5;
	for(int x=10;x>=1;x--)
	{
	   if(x%2!=0)
	   System.out.println(a+" * "+ x +" = "+ (a*x));
	}

   }
}

/*__________________________________________________________________________________________*/

class evenresult
{
   public static void main(String [] args)
   {
	int a=13;
	for(int x=10;x>=1;x--)
	{
	   if((a*x)%2==0)
	   System.out.println(a+" * "+ x +" = "+ (a*x));
	}

   }
}



/*__________________________________________________________________________________________*/

class evensum
{
   public static void main(String [] args)
   {
	int a=13,sum=0;
	for(int x=10;x>=1;x--)
	{
	   if((a*x)%2==0)
		sum+=(a*x);
	   System.out.println(a+" * "+ x +" = "+ (a*x));
	}
	System.out.println("The sum of even numbers as result is "+sum);
   }
}

/*__________________________________________________________________________________________*/

class factors
{
   public static void main(String [] args)
   {
	int a=15;
	for(int i=1;i<=a;i++)
	{
	   if(a%i==0)
	   System.out.println(i);
	}	
   }
}

/*__________________________________________________________________________________________*/

class perfectno
{
   public static void main(String [] args)
   {
	int a=6,b=a,sum=0;
	for(int i=1;i<=b/2;i++)
	{
	   if(b%i==0)
		sum+=i;
	}
	if(a==sum)
	  System.out.println(a+" is perfect number");
	else
	  System.out.println(a+" is not a perfect number");	
   }
}

/*__________________________________________________________________________________________*/

class sub
{
  public static void main (String [] args)
  {
    int a=100;
    for(int i=2;i<=100; i=i+2)
    {
	System.out.println(a+"-"+i+" = "+(a-i));
    }

  }
}

/*__________________________________________________________________________________________*/

class armstrong
{
   public static void main(String [] args)
   {
	//int x=371,n=x,count=0,sum=0;
      for(int x=1;x<=1000;x++)
       {
	 int n=x,count=0,sum=0;
        while(n>0)
	 { 
	  count++;
	  n/=10;
	 }
	//System.out.println(count);

	n=x;

	while(n>0)
	 {
	  int r=n%10;
	  sum+=Math.pow(r,count);
	  n/=10;
	 }
	if(sum==x)
	System.out.println(x);
      } 
   }
}





















 