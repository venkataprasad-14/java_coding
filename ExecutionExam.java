class primerange
{
  public static void main(String [] args)
  {
     int count=0;
     for(int i=1;i<=100;i++)
     {
	int count1=0;
        for(int j=1; j<=i; j++)
        {
 	    if(i%j==0)
            	count1++;
	}
        if(count1==2)
	{
	  count++;
   	  System.out.println(i);
        }
     }
     System.out.println("there are "+count+" prime number from 1 to 100");
  }
}


//________________________________________________________________________

class palindromerange
{
  public static void main(String [] args)
  {
     int count=0;
     for(int i=1;i<=100;i++)
     {
        int n=i,rev=0;
	while(n>0)
      	{
	   rev=(rev*10)+(n%10);
	   n=n/10;
	}
	if(rev==i)
	{
	   count++;
	   System.out.println(i);
	}
     }
     System.out.println("there are "+count+" palindrome numbers from 1 to 100");
  }
}

//________________________________________________________________________

class armstrongrange
{
  public static void main(String [] args)
  {
     int county=0;
     for(int i=1;i<=1000;i++)
     {
        int n=i,sum=0,count=0;
	while(n>0)
      	{
	   count++;
	   n=n/10;
	}
	n=i;
	while(n>0)
	{
	  int m=n%10;
	  double d=Math.pow(m,count);
	  sum+=d;
	   n=n/10;
	}
	if(sum==i)
	{
	   county++;
	   System.out.println(i);
	}
     }
    System.out.println("there are "+ county +" armstrong numbers from 1 to 1000");

  }
}

//________________________________________________________________________

class leapyear
{
  public static void main(String [] args)
  {
     for(int i=1500;i<=2000;i++)
     {
	if(i%4==0 && (i%100!=0 || i%400==0))
	{
	   System.out.println(i);
	}
     }
  }
}

//________________________________________________________________________

class tables
{
  public static void main(String [] args)
  {
     for(int i=1;i<=5;i++)
     {
	for(int j=1;j<=10;j++)
         {
	   System.out.println(i +"*"+j +"="+(i*j));
	 }
     }
  }
}
 

//________________________________________________________________________

class maxdigit
{
  public static void main(String [] args)
  {
       int x=465,max=0;
     	while(x>0)
	{
	  int o=x%10;
	  max=Math.max(max,o);
	  x/=10;
	}
	System.out.println(max);
  }
}

//________________________________________________________________________

class secondmaxdigit
{
  public static void main(String [] args)
  {
       int x=4659,smax=0,max=0;
     	while(x>0)
	{
	  int o=x%10;
	  if(o>max)
	  {
 	    smax=max;
	    max=o;
          }
	  else if(o<max && o>smax)
		smax=o;
	  x/=10;
	}
	System.out.println(smax);
  }
}
//______________________________________________________________

//section-2


class evil
{
  public static void main(String [] args)
  {
        int n=45,square=1,sum=0;
	square=n*n;
	System.out.println("The square of the number is "+square);
	while(square>0)
      	{
	   sum+=(square%10);
	   square=square/10;
	}
	if(sum==n)
	{
	   System.out.println("The sum of the digits of sqaure of given number is "+sum);
	   System.out.println(n+" is evil number");
	}
	else
	{
	    System.out.println("The sum of the digits of sqaure of given number is "+sum);
	   System.out.println(n+" is not an evil number");
	}

   }
}


//______________________________________________________________


class power
{
  public static void main(String [] args)
  {
        int n=132,pro=1,sum=0;
	while(n>0)
      	{
	   int m=n%10;
	   sum+=m;
	   pro*=m;
	   n=n/10;
	}
	if(sum==pro)
	   System.out.println("power number");
	else
	   System.out.println("Not a power number");
   }
}

//___________________________________________________________


class automatic
{
  public static void main(String [] args)
  {
        int n=76,m=n,sq=1,count1=0,count2=0;
	sq=n*n;
	while(n>0)
      	{
	   count1++;
	   n=n/10;
	}
	int s=sq;
	while(s>0)
	{
	   count2++;
	   s=s/10;
	   if(count2==count1)
	     break;
	}
	  int pow=(int)Math.pow(10,count2);
	//System.out.println(pow);
	if(m==sq%pow)
	   System.out.println(m+"is Automatic number");
	else
	   System.out.println(m+" is not an Automatic number");
   }
}

//remarks= extra usage of 2nd while, bcz manam check cheyalsindi manam tesukuna number count,sqaure count avasaram ledu.

//code in correct way



//___________________________________________________________


class technology
{
  public static void main(String [] args)
  {
        long n=961466154150l,num1=0,num2=0,sum=0,square=1;int count1=0,count2=0;
	long num=n;
	while(num>0)
      	{
	   count1++;
	   num/=10;
	}
	
	if(count1%2==0)
	{
	  num=n;
	   while(num>0)
      	    {
	      count2++;
	      num/=10;
	      if(count2==count1/2)
	     	break;
	    }
	   int pow=(int)Math.pow(10,count2);
	   num=n;
	   num1=num%pow;
	   num2=num/pow;
	   sum=num1+num2;
	   square=sum*sum;
	   if(n==square)
		System.out.println(n+" is Technology number");
	   else
	 	System.out.println(n+" is not a Technology number");
	}
	else
	  System.out.println("Not eligible to check whether it is technology number or not ");
  }
}

//________________________________________________________________

class busy
{
  public static void main(String [] args)
  {
    int n=27;
    int l=n%10;
    if(l==7)
    {
       System.out.println("The number is busy number");
    }
   else if(n%7==0)
     {
	  System.out.println("The number is busy number");
     }
    else
	System.out.println("The number is not a busy number");
  }
}

//__________________________________________________________________________

class inav
{
  public static void main(String [] args)
  {
     int num=199,sum=0,count=0;
	while(num>0)
      	{
	   sum=sum+(num%10);
	   num/=10;
	}
	int s=sum;
	while(s>0)
	{
	   count++;
           s/=10;
	}
	while(count>1)
	{
	  num=sum;
	  sum=0;
          count=0;
	  while(s>0)
      	   {
	     sum=sum+(num%10);
	     num/=10;
	   }
	    s=sum;
	   while(s>0)
	   {
	     count++;
             s/=10;
     	   }
	   if(count==1)
	   break;
	}
	if(sum==1) 
	    System.out.println("Inav number");
	else
            System.out.println("Not an Inav number");

  }

}















