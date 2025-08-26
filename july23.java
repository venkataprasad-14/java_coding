class Armstrong
{
  public static void main(String [] args)
  {
  	int num1=1634,num2=num1;
	int sum=0;
        while(num2>0)
	{
	  int r=(num2%10);
	  sum=sum+(r*r*r*r);
	   num2/=10;
	}
	if(num1==sum)
	{
	 System.out.println(num1+" is an armstrong number"); 
	}
	else
	 System.out.println(num1+" is not an Armstrong number");
  }
}

/*_______________________________________________________________________________*/

class palindrome
{
  public static void main(String [] args)
  {
    int p=12321,q=p;
    int r=0;
    while(q>0)
    {
	r=r*10 +( q%10 );
     	q/=10;
    }
    System.out.println((p==r)?("palindrome"):("not a palindrome"));
  }
}

/*_______________________________________________________________________________*/

class A
{
  public static void main(String [] args)
  {
    int p=12321,q=p;
    int r=0;
    while(q>0)
    {
	r=r*10 +( q%10 );
     	q/=10;
    }
    System.out.println((p==r)?("palindrome"):("not a palindrome"));
  }
}