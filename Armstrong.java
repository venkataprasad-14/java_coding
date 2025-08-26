class Armstrong
{
  public static void main(String [] args)
  {
	int n1=371,n2=n1,count=0;
	double sum=0;
	while(n2>0)
	{
	   count++;
	   n2/=10;
	}
	n2=n1;
	while(n2>0)
	{
	  int n=n2%10;
	  sum=sum + Math.pow(n,count);
	  n2/=10;
	}
	System.out.println((sum==n1)?("Armstrong"):("Not an Armstrong"));
  }
}

/*__________________________________________________________________________________________*/

//armstrong from 1 to 1000

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

/*____________________________________________________________________________________________________________________________________________________________________*/
//reverse a number and again reverse that reversed number eg-12000, rev1=21, rev2 comes like 12 but i should get 12000 which is the given value.

class ror
{
  public static void main(String [] args)
  {
    int n1=12000,n2=n1,rev1=0,rev2=0,count1=0,count2=0; 
    System.out.println("The given number is "+n1);
    while(n2>0)
    {
	count1++;
	rev1=(rev1*10)+(n2%10);
        n2/=10;

    }
    System.out.println("The reverse the number is "+rev1 );
    while(rev1>0)
    {
	count2++;
	rev2=(rev2*10)+(rev1%10);
        rev1/=10;
    }
    if(count1==count2)
    	System.out.println("The 2nd reversed number is "+rev2);
    else if(count1>count2)
    {
	int p=count1-count2;
	double d=Math.pow(10,p);
	rev2*=d;
	System.out.println("The 2nd time reversed  number is "+rev2);
    }
     
  }
}


/*____________________________________________________________________________________________________________________________________________________________________*/
//find the avg of digits in a number
  
class avg
{
  public static void main(String [] args)
  {
    int a=987,b=a,count=0;
    double sum=0,avg=0;
    while(b>0)
    {
      int s=b%10;
      count++;
      sum=sum+s;
      b=b/10;
    }
    System.out.println("The average of numbers of digits  in a number is " + (sum/count));
  }
}

/*___________________________________________________________________________________________________________________________________________________________________*/
//find the sum of products of(1,7,6,5),(2,3,4,8,9) digits in a number
  
class SumOfProducts
{
  public static void main(String [] args)
  {
    int n1=335667492,count=0;
    int sum=0,pro1=1,pro2=1;
    while(n1>0)
    {
      int s=n1%10;
      count++;
      if(count==1||count==7||count==6||count==5)
	pro1=pro1*s;
      if(count==2||count==3||count==4||count==8||count==9)
	pro2=pro2*s;
      n1=n1/10;
    }
    System.out.println("The product of 1,7,6,5th digits is" + pro1);
    System.out.println("The product of 2,3,4,8,9th digits is" + pro2);
    System.out.println("The sum of products of the digits is " + (pro1+pro2));
  }
}

/*___________________________________________________________________________________________________________________________________________________________________*/
//minmaxno priority
  
class count
{
  public static void main(String [] args)
  {
    int n1=123456789,count1=0,count2=0,count3=0;
 
    while(n1>0)
    {
      int r=n1%10;
      if(r>=1 && r<=4)
      {
	count1++;
	//System.out.println("Min Priority");
      }
    else if(r==5)
      {
	count2++;
	//System.out.println("No Priority");
      }

      else//if(r>=6 && r<=10)
      {
	count3++;
	//System.out.println("Max Priority");
      }     
      n1=n1/10;
    }
    System.out.println("The number of min priorities are" + count1);
    System.out.println("The number of no priorities are" + count2);
    System.out.println("The number of max priorities are " + count3);

  }
}

/*_______________________________________________________________________________________________________________________________________________________________________________________*/

//print even and odd counts in a digit 

class evenoodd	
{
  public static void main(String [] args)
  {
  	int num1=1634;
	int count1=0,count2=0;
        while(num1>0)
	{
	  int r=(num1%10);
	  if(r%2==0)
		count1++;
	  else
		count2++;
	   num1/=10;
	}
	 System.out.println("The even count is "+count1); 
	 System.out.println("The even count is "+count2);
  }
}

/*___________________________________________________________________________________________________________________________________________________________________*/
//find the sum of even count digits and multiplication of odd count digits in a number
  
class SP
{
  public static void main(String [] args)
  {
    int n1=335667492,count=0;
    int sum=0,pro=1;
    while(n1>0)
    {
      int s=n1%10;
      count++;
      if(count%2==0)
	sum=sum+s;
      else
      {
	System.out.println(s);
	pro=pro*s;
       }
      n1=n1/10;
    }
    System.out.println("The product of odd digits is" + pro);
    System.out.println("The sum of even digits is " + sum);
  }
}

/*___________________________________________________________________________________________________________________________________________________________________*/


class A
{
  public static void main(String [] args)
  {
    int n1=987563,n2=n1,se=0,so=0,sum=0,pe=1,po=1,product=1;
    while(n2>0)
    {
	

    }
  }
}



















